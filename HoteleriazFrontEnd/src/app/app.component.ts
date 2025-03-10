import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { NavbarComponent } from './components/navbar/navbar.component';
import { LandingPageComponent } from './pages/landing-page/landing-page.component';
import { FooterComponent } from './components/footer/footer.component';
import { ServiciosComponent } from './pages/servicios/servicios.component';
import { HotelesComponent } from './components/hoteles/hoteles.component';
import { CrudComponent } from './pages/crud/crud.component';
import { ProductListComponent } from './components/product-list/index/product-list.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


@Component({
  selector: 'app-root',
  imports: [
    RouterOutlet,
    NavbarComponent,
    FooterComponent,
    LandingPageComponent,
    HotelesComponent,
    CrudComponent,
    ServiciosComponent,
    ProductListComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'Hoteleriaz';
}
