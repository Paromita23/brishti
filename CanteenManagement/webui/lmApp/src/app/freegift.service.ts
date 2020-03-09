import { Injectable } from '@angular/core';
import {Http, Response} from '@angular/http';
import {Observable} from 'rxjs';
import {Freegift} from './freegift';
import 'rxjs/add/operator/map';
//import { Orders } from './orders';
@Injectable({
  providedIn: 'root'
})
export class FreegiftService {

  constructor(private http :Http) { }
  showgft() : Observable<Freegift[]>{
    return this.
    http.get("http://localhost:8080/MLP178-0.0.1-SNAPSHOT/api/freegift").
    map((res : Response)=> res.json());
}
}
