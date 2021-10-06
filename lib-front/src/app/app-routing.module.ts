import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddSectionComponent } from './section/add-section/add-section.component';
import { SectionDetailComponent } from './section/section-detail/section-detail.component';
import { SectionListComponent } from './section/section-list/section-list.component';

const routes: Routes = [
  {path: 'add-section', component: AddSectionComponent},
  {path: 'section-list', component: SectionListComponent},
  {path: 'section-detail/:id', component: SectionDetailComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
