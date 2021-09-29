import { Component, OnInit } from '@angular/core';
import { Section } from 'src/app/interface/section';
import { SectionService } from '../section-service.service';

@Component({
  selector: 'app-section-list',
  templateUrl: './section-list.component.html',
  styleUrls: ['./section-list.component.scss']
})
export class SectionListComponent implements OnInit {

  sections : Section[] = []

  constructor(private sectionService:SectionService) { }

  ngOnInit(): void {
    this.sectionService.getAll().subscribe(
      resp => {
        console.log(resp);
        this.sections = resp;
      }
    )
  }

}