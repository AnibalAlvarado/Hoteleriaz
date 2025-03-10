import { Routes } from '@angular/router';
import { ServiciosComponent } from './pages/servicios/servicios.component';
import { LandingPageComponent } from './pages/landing-page/landing-page.component';
import { CrudComponent } from './pages/crud/crud.component';

export const routes: Routes = [
    { path: 'servicios', component: ServiciosComponent },
    { path: 'crud', component: CrudComponent },
    { path: 'inicio', component: LandingPageComponent },
    { path: '', redirectTo: 'inicio', pathMatch: 'full' },
    { path: '**', redirectTo: 'inicio' } // Manejo de rutas no encontradas
  ];
