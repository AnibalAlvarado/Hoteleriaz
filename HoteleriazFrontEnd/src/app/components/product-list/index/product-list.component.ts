import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { ProductService } from '../../../services/product.service';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { FormsModule } from '@angular/forms';
import { MatDialog, MatDialogActions, MatDialogModule } from '@angular/material/dialog';
import { ProductListFormComponent } from '../form/product-list-form/product-list-form.component';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-product-list',
  standalone : true,
  imports: [
    CommonModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatIconModule,
    FormsModule,
    MatDialogModule
  ],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.scss'
})
export class ProductListComponent implements OnInit {
  products: any[] = [];
  searchTerm: string = '';
  filteredProducts: any[] = [];
  selectedCategory: string | null = null;
  selectedPrice: number | null = null;

  constructor(
    private productService: ProductService,
    private dialog: MatDialog,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit() {
    this.products = this.productService.getProducts();
    this.applyFilters();

    this.route.queryParams.subscribe(params => {
      this.selectedCategory = params['category'] || null;
      this.selectedPrice = params['price'] ? +params['price'] : null;
      this.applyFilters();
    });
  }

  filtrarProductos() {
    this.applyFilters();
  }

  applyFilters() {
    this.filteredProducts = this.products.filter(product => {
      const matchesSearch = this.searchTerm
        ? product.name.toLowerCase().includes(this.searchTerm.toLowerCase())
        : true;

      const matchesCategory = this.selectedCategory
        ? product.category === this.selectedCategory
        : true;

      const matchesPrice = this.selectedPrice
        ? product.price <= this.selectedPrice
        : true;

      return matchesSearch && matchesCategory && matchesPrice;
    });
  }

  openDialog(mode: 'create' | 'edit' | 'delete', product?: any) {
    const dialogRef = this.dialog.open(ProductListFormComponent, {
      data: { mode, product },
    });
  }
}
