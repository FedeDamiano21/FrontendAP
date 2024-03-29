import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Skill } from '../model/skill';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SkillService {
  URL = 'https://frontendap-ae6eb.web.app//skill/'
  
  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Skill[]>{
    return this.httpClient.get<Skill[]>(this.URL + 'lista');
  }

  public detail(id: number): Observable<Skill>{
    return this.httpClient.get<Skill>(this.URL + `detail/${id}`);
  }

  public save(skill: Skill): Observable<any>{
    return this.httpClient.post<any>(this.URL + 'create', skill);
  }

  public update(id: number, skill: Skill): Observable<any>{
    return this.httpClient.put<any>(this.URL + `update/${id}`, skill);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.URL + `delete/${id}`);
  }
}
