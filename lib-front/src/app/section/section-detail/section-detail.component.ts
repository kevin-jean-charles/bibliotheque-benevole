import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Section } from 'src/app/interface/section';
import { SectionService } from '../section-service.service';

@Component({
  selector: 'app-section-detail',
  templateUrl: './section-detail.component.html',
  styleUrls: ['./section-detail.component.scss'],
})
export class SectionDetailComponent implements OnInit {
  currentSection!: Section;
  sectionForm = new FormGroup({
    name: new FormControl(''),
    description: new FormControl(''),
  });

  constructor(
    private sectionService: SectionService,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.getSection();
  }

  getSection() {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.sectionService.get(id).subscribe((resp) => {
      this.sectionForm.setValue({
        name: resp.name,
        description: resp.description,
      });
      this.currentSection = resp;
    });
  }

  onSubmit() {
    this.currentSection.name = this.sectionForm.value.name;
    this.currentSection.description = this.sectionForm.value.description;
    this.sectionService
      .update(this.currentSection.id, this.currentSection)
      .subscribe((resp) => {
        console.log(resp);
      });
  }
}
