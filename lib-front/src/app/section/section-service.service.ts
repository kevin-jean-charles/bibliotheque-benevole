import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Section } from '../interface/section';

@Injectable({
  providedIn: 'root'
})
export class SectionService {

  constructor(private http: HttpClient) { }

  add(data : any) : Observable<any> {
    return this.http.post<Section>(environment.base_url + '/section', data);
  }
  
}


