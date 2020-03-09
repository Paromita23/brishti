import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Freegift } from '../freegift';
import { FreegiftService } from '../freegift.service';

@Component({
  selector: 'app-freegift',
  templateUrl: './freegift.component.html',
  styleUrls: ['./freegift.component.css']
})
export class FreegiftComponent implements OnInit {
  menu : Observable<Freegift[]>
  //menu1 : Observable<Freegift>
  //menId : number;
  constructor(private freegiftService : FreegiftService) {
    this.menu=freegiftService.showgft();
   }

  ngOnInit() {
  }

}
