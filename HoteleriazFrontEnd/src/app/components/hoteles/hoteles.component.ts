import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { MatCardModule } from '@angular/material/card';

@Component({
  selector: 'app-hoteles',
  standalone: true,
  imports: [CommonModule,MatCardModule],
  templateUrl: './hoteles.component.html',
  styleUrl: './hoteles.component.scss'
})
export class HotelesComponent {
  hoteles = [
    {
      nombre: 'Hotel Paraíso',
      imagen: 'assets/hotel1.jpg',
      descripcion: 'Un hermoso hotel con vista al mar.'
    },
    {
      nombre: 'Hotel Montaña',
      imagen: 'assets/hotel2.jpg',
      descripcion: 'Un refugio en la naturaleza con excelente servicio.'
    },
    {
      nombre: 'Hotel Urbano',
      imagen: 'assets/hotel3.jpg',
      descripcion: 'El lujo y la comodidad en el centro de la ciudad.'
    }
  ];
}
