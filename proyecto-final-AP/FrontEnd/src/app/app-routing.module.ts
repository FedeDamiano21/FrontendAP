import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { EditExperienciaComponent } from "./components/experiencia/edit-experiencia.component";
import { NewExperienciaComponent } from "./components/experiencia/new-experiencia.component";
import { HomeComponent } from "./components/home/home.component";
import { IniciarSesionComponent } from "./components/iniciar-sesion/iniciar-sesion.component";

const routes: Routes = [
    { path: '', component: HomeComponent },
    { path: 'iniciar-sesion', component: IniciarSesionComponent },
    { path: 'nuevaexp', component: NewExperienciaComponent},
    { path: 'editexp/:id', component: EditExperienciaComponent }
];


@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }