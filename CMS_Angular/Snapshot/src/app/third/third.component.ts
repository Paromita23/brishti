import { Component, OnInit } from '@angular/core';
import { ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-third',
  templateUrl: './third.component.html',
  styleUrls: ['./third.component.css']
})
export class ThirdComponent implements OnInit {
  name : string;
  age : number;

  constructor(private route: ActivatedRoute) {
    this.name=this.route.snapshot.params["name"];
    this.age=this.route.snapshot.params["age"];
   }
  ngOnInit() {
  }

}
