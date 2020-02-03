import { Injectable } from '@angular/core';
import {Http, Response} from '@angular/http';
import {User} from "./user";
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  
  constructor(private http:Http) { 
  }

  getAllUsers():Observable<User[]> {
    return this.http.get
    ("https://jsonplaceholder.typicode.com/Users")
    .map((res:Response)=>res.json());
  }
  // getAllUsers():Observable<HttpResponse<User>>{ 
      
  //   return this._httpClient.get<User>('https://jsonplaceholder.typicode.com/users',{observe:'response'});
  // }

  // getAllUsers():void{console.log('came inside the actual service method....')}

}
