import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {Routes,RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { Child1Component } from './child1/child1.component';
import { Child2Component } from './child2/child2.component';
import { ComponentTwoComponent } from './component-two/component-two.component';
import { ComponentOneComponent } from './component-one/component-one.component';
import { ChildOneComponent } from './child-one/child-one.component';
import { ChildTwoComponent } from './child-two/child-two.component';

export const routes:Routes=[
  {path:'',redirectTo : 'component-one',pathMatch:'full'},
   { path:'component-one',component: ComponentOneComponent },
   { path:'component-two',component: ComponentTwoComponent ,
    children:[
      {path:'', redirectTo:'child-one', pathMatch:'full'},
    { path:'child-one', component: ChildOneComponent },
    { path:'child-two', component: ChildTwoComponent}
    ]
  }
];

@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    Child1Component,
    Child2Component,
    ComponentTwoComponent,
    ComponentOneComponent,
    ChildOneComponent,
    ChildTwoComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
