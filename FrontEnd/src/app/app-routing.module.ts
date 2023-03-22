import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { EditacercadeComponent } from "./components/acerca-de/editacercade.component";
import { EditeducacionComponent } from "./components/educacion/editeducacion.component";
import { NeweducacionComponent } from "./components/educacion/neweducacion.component";
import { EditExperienciaComponent } from "./components/experiencia/edit-experiencia.component";
import { NewExperienciaComponent } from "./components/experiencia/new-experiencia.component";
import { HomeComponent } from "./components/home/home.component";
import { EditSkillComponent } from "./components/hys/edit-skill.component";
import { NewSkillComponent } from "./components/hys/new-skill.component";
import { IniciarSesionComponent } from "./components/iniciar-sesion/iniciar-sesion.component";

const routes: Routes = [
    { path: '', component: HomeComponent },
    { path: 'iniciar-sesion', component: IniciarSesionComponent },
    { path: 'nuevaexp', component: NewExperienciaComponent},
    { path: 'editexp/:id', component: EditExperienciaComponent },
    { path: 'nuevaedu', component: NeweducacionComponent },
    { path: 'editedu/:id', component: EditeducacionComponent },
    { path: 'newskill', component: NewSkillComponent },
    { path: 'editskill/:id', component: EditSkillComponent },
    { path:  'editacercade/:id', component: EditacercadeComponent }
];


@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }