import {Component, inject} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {fontAwesomeIcons} from "./shared/font-awesome-icons";
import {FaIconLibrary, FontAwesomeModule} from "@fortawesome/angular-fontawesome";
import {NavigationComponent} from "./layout/navigation/navigation.component";
import {LibraryComponent} from "./layout/library/library.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FontAwesomeModule, NavigationComponent, LibraryComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'spotify-clone-front';

  private faIconLibrary:FaIconLibrary = inject(FaIconLibrary);

  ngOnInit(): void{
    this.initFontAwesome();
  }

  private initFontAwesome(){
    this.faIconLibrary.addIcons(...fontAwesomeIcons);
  }
}
