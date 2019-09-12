import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {environment} from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  baseurl=environment.baseUrl;

  constructor(private http: HttpClient) { }
  
  public postrequest(url:any,data:any):any{
    return this.http.post(this.baseurl+url,data);
  }
}
