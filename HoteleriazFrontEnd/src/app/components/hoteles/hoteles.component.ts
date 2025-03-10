import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { MatButton, MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { ProductService } from '../../services/product.service';

@Component({
  selector: 'app-hoteles',
  standalone: true,
  imports: [CommonModule,MatCardModule, MatButtonModule],
  templateUrl: './hoteles.component.html',
  styleUrl: './hoteles.component.scss'
})
export class HotelesComponent implements OnInit{
  products: any[] = [];
  constructor(private productService: ProductService) {}
  ngOnInit(): void {
    this.products = this.productService.getProducts();
  }
}
