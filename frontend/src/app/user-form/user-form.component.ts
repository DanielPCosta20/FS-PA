import { ApiService } from './../api.service';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  user: any = {};

  constructor(private apiService: ApiService) { }

  ngOnInit() {
  }

  saveUser(){
    if (this.user.id) {
      this.apiService.updateUser(this.user).subscribe();
    } else {
      this.apiService.addUser(this.user).subscribe();
    }
  }

}
