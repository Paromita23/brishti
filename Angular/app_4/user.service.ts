import { Injectable } from '@angular/core';
import {Http,Response} from '@angular/http';
import { getDefaultService } from '../../node_modules/@types/selenium-webdriver/chrome';
import { Observable } from '../../node_modules/rxjs';
import { User } from "./user";
import 'rxjs/add/operator/map';

@Injectable({
  providedIn: 'root'
})
export class UserService {
constructor(private http:Http) {  

}
getUser(): Observable<User[]>{
    return this.http.get
    ("https://jsonplaceholder.typicode.com/users")
    .map((res:Response)=>res.json());
  }
  
}
