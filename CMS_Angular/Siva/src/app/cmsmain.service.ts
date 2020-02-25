import { Injectable } from '@angular/core';
import {Http, Response} from '@angular/http';
import {Observable} from 'rxjs';
import 'rxjs/add/operator/map';

@Injectable({
  providedIn: 'root'
})
export class CmsmainService {

  constructor(private http :Http) { }
  validateCustomer(user : string, pwd : string) : Observable<string> {
    return this.
    http.get("https://drive.google.com/open?id=18uqodYTuXKw19JhJzRTsKyyv9pnFsYpl").
    map((res : Response) => res.text());
  }
}
