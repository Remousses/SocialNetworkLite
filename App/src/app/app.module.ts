import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NewsComponent } from './component/news/news.component';
import { FriendshipComponent } from './component/friendship/friendship.component';
import { HomeComponent } from './component/home/home.component';
import { NewPostComponent } from './component/new-post/new-post.component';
import { ProfileComponent } from './component/profile/profile.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    NewsComponent,
    FriendshipComponent,
    HomeComponent,
    NewPostComponent,
    ProfileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    // MatCardModule,
    // MatButtonModule,
    // MatFormFieldModule,
    // MatGridListModule,
    // MatInputModule,
    // MatSidenavModule,
    // MatSnackBarModule,
    // MatToolbarModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
