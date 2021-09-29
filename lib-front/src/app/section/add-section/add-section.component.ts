import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { SectionService } from '../section-service.service';

@Component({
  templateUrl: './add-section.component.html',
  styleUrls: ['./add-section.component.scss']
})
export class AddSectionComponent implements OnInit {
  addSectionForm = new FormGroup({
    name: new FormControl(''),
    description: new FormControl('')
  });

  constructor(private sectionService: SectionService) { }

  ngOnInit(): void {
  }

  onSubmit() {
    console.log(this.addSectionForm.value);
    
    this.sectionService.add(this.addSectionForm.value).subscribe(
      resp => {
        console.log(resp);       
      }
    )
  }
}
