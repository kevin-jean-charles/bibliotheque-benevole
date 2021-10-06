import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { AddSectionComponent } from './section/add-section/add-section.component';
import { ReactiveFormsModule } from '@angular/forms';
import { SectionListComponent } from './section/section-list/section-list.component';
import { SectionDetailComponent } from './section/section-detail/section-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    AddSectionComponent,
    SectionListComponent,
    SectionDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
