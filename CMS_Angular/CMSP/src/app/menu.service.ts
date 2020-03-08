import { Injectable } from '@angular/core';
import {Http, Response} from '@angular/http';
import {Observable} from 'rxjs';
import {Menu} from './menu';
import 'rxjs/add/operator/map';

@Injectable({
  providedIn: 'root'
})
export class MenuService {
  searchMenu(menuId: number): Observable<Menu> {
    return this.
    http.get("http://localhost:8080/MLP178-0.0.1-SNAPSHOT/api/menu/showmenu/"+menuId).
    map((res : Response)=> res.json());
  }

  constructor(private http : Http) { }

  showMenu() : Observable<Menu[]>{
    return this.
    http.get("http://localhost:8080/MLP178-0.0.1-SNAPSHOT/api/menu").
    map((res : Response)=> res.json());
  }
}
