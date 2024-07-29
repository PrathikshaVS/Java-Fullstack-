import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name : string;
  age :number;
  email : string;
  txtColor: string;
  imgPath : string;

  constructor(){
    this.name="prathi";
    this.age=20;
    this.email="prathi@gmail.com"
    this.txtColor="green";
    this.imgPath="https://d585tldpucybw.cloudfront.net/sfimages/default-source/blogs/2023/2023-11/angular-logo-1200-628.png?sfvrsn=bf64b1ee_3"
  }
  getAddition(a:number,b:number){
    let sum =a+b;
    return sum;
  }
  changeName(){
    this.name="vijay";
  }
  changeEmail(){
    this.email="vijay@gmail.com";
  }
  changeAge(){
    this.age=40;
  }
  changeImg(){
      this.imgPath="https://www.searchenginejournal.com/wp-content/uploads/2019/04/the-seo-guide-to-angular.png";
  }
  title = 'MyAngularProject1';
}
