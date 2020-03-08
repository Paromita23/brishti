import { Component, OnInit } from '@angular/core';
import { ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {
  name : string;
  age : number;

  constructor(private route: ActivatedRoute) {
    this.name=this.route.snapshot.params["name"];
    this.age=this.route.snapshot.params["age"];
   }

  ngOnInit() {
  }

}
