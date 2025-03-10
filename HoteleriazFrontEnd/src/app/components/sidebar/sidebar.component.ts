import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Router, RouterModule } from '@angular/router';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';
import { MatSliderModule } from '@angular/material/slider';

@Component({
  selector: 'app-sidebar',
  standalone: true,
  imports: [CommonModule, RouterModule, MatSidenavModule, MatListModule, MatSliderModule],
  templateUrl: './sidebar.component.html',
  styleUrl: './sidebar.component.scss'
})
export class SidebarComponent {
  constructor(private router: Router) {}

  showAllHotels() {
    this.router.navigate(['/crud']); // Redirige a la página que muestra todos los hoteles
  }
  applyPriceFilter(event: Event) {
    const target = event.target as HTMLInputElement;
    const price = target.value;
    this.router.navigate(['/crud'], { queryParams: { price } });
  }
}
