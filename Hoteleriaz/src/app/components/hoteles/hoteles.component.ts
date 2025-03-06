import { Component } from '@angular/core';

@Component({
  selector: 'app-hoteles',
  standalone: true,
  imports: [],
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
