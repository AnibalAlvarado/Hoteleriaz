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
}
