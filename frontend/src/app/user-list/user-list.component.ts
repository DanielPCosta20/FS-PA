// src/app/user-list/user-list.component.ts
import { Component, OnInit } from '@angular/core';
import { UserService, User } from '../user.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  users: User[] = [];
  selectedUser: User | undefined;
  newUser: User = { id: 0, nome: '', email: '' };
  updateUser: User = { id: 0, nome: '', email: '' };
  getId: number = 0;

  constructor(private userService: UserService) { }

  ngOnInit(){
    console.log("OLA");
    this.refreshUsers();
    console.log(this.users);
  }

  refreshUsers() {
    this.userService.getAllUsers().subscribe(users => {
      console.log(users)
      this.users = users;
    });
  }

  getUserById() {
    this.userService.getUserById(this.getId).subscribe(user => {
      this.selectedUser = user;
    });
  }

  deleteUserById() {
    this.userService.deleteUser(this.getId).subscribe(() => {
      this.refreshUsers();
    });
  }

  addUser() {
    this.userService.addUser(this.newUser).subscribe(() => {
      this.newUser = { id: 0, nome: '', email: '' };
      this.refreshUsers();
    });
  }

  updateUserById() {
    this.userService.updateUser(this.updateUser.id, this.updateUser).subscribe(() => {
      this.updateUser = { id: 0, nome: '', email: '' };
      this.refreshUsers();
    });
  }
}