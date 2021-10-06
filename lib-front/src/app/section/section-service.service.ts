import { HttpClient, HttpHeaders  } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Section } from '../interface/section';
import { catchError, map, tap } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class SectionService {

  constructor(
    private http: HttpClient,
   ) { }

  add(data : any) : Observable<Section> {
    return this.http.post<Section>(environment.base_url + '/sections', data);
  }

  getAll() : Observable<Section[]> {
    return this.http.get<Section[]>(environment.base_url + '/sections');
  }

  get(id : number) : Observable<Section> {
    return this.http.get<Section>(environment.base_url + '/sections/' + id);
  }  

  update(id : number, data : any) : Observable<Section> {
    return this.http.put<Section>(environment.base_url + '/sections/' + id, data);
  }

  delete(id : number) : Observable<any> {
    return this.http.delete<any>(environment.base_url + '/sections/' + id);
  }
}


