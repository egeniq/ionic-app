import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
//TODO: REMOVE THIS NAVIGATE, AFTER IMPLEMENTS NAVIGATION FROM PAGES
import {WelcomePage} from "../welcome/welcome";

@Component({
  selector: 'page-welcome',
  templateUrl: 'wifiConfirmation.html',
})
export class WifiConfirmation {

  constructor(public navCtrl: NavController, public navParams: NavParams) {
  }

  // TODO: REMOVE THIS NAVIGATE, AFTER IMPLEMENTS NAVIGATION FROM PAGES
  async navigateTo(page: string) {
    if (page === 'welcome') {
      await this.navCtrl.push(WelcomePage);
    }
  }

}
