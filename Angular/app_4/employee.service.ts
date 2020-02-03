import { Injectable } from '@angular/core';
import {Http,Response} from '@angular/http';
import { getDefaultService } from '../../node_modules/@types/selenium-webdriver/chrome';
import { Observable } from '../../node_modules/rxjs';
import { Employee } from "./employee";
import 'rxjs/add/operator/map';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
constructor(private http: Http) { }
showEmploy(empid) : Observable<Employee>{
  return this.http.get("http://localhost:8080/ftp87/api/employees/" +empid).map((res: Response) => res.json());
}

getEmployee(): Observable<Employee[]>{
  return this.http.get
  ("http://localhost:8080/ftp88/api/employees")
  .map((res:Response)=>res.json());
}
}

