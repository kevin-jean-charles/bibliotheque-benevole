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
    return this.http.post<Section>(environment.base_url + '/sections', data);
  }

  getAll() : Observable<any> {
    return this.http.get<any>(environment.base_url + '/sections');
  }

  get(id : number) : Observable<any> {
    return this.http.get<any>(environment.base_url + '/sections/' + id);
  }  

  update(id : number, data : any) : Observable<any> {
    return this.http.put<any>(environment.base_url + '/sections/' + id, data);
  }

  delete(id : number) : Observable<any> {
    return this.http.delete<any>(environment.base_url + '/sections/' + id);
  }
}


