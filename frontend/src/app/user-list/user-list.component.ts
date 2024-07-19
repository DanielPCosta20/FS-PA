import { ApiService } from './../api.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  users: any[] = [];

  constructor(private apiService: ApiService) { }

  ngOnInit() {
    /*this.apiService.getUsers().subscribe((data: any[]) => {this.users = data;});*/
  }

}

