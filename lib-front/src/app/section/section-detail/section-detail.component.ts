import { Component, OnInit } from '@angular/core';
import { SectionService } from '../section-service.service';

@Component({
  selector: 'app-section-detail',
  templateUrl: './section-detail.component.html',
  styleUrls: ['./section-detail.component.scss']
})
export class SectionDetailComponent implements OnInit {

  constructor(private sectionService:SectionService) { }

  ngOnInit(): void {
  }

}
