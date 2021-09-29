import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddSectionComponent } from './section/add-section/add-section.component';

const routes: Routes = [
  {path: 'add-section', component: AddSectionComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
