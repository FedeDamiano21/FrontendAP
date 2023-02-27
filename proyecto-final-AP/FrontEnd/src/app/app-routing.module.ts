import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { HomeComponent } from "./components/home/home.component";
import { IniciarSesionComponent } from "./components/iniciar-sesion/iniciar-sesion.component";

const routes: Routes = [
    {path:'', component: HomeComponent},
    {path:'iniciar-sesion', component: IniciarSesionComponent}
];


@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }