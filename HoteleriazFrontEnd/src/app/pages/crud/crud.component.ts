import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-crud',
  imports: [CommonModule],
  templateUrl: './crud.component.html',
  styleUrl: './crud.component.scss'
})
export class CrudComponent {
  hoteles = [
    { id: 1, nombre: 'Hotel Paraíso', ubicacion: 'Playa Azul' },
    { id: 2, nombre: 'Hotel Montaña', ubicacion: 'Sierra Verde' },
    { id: 3, nombre: 'Hotel Urbano', ubicacion: 'Centro Ciudad' }
  ];
}
