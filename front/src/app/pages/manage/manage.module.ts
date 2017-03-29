/**
 * Created by jayani on 3/29/2017.
 */
import { NgModule }      from '@angular/core';
import { CommonModule }  from '@angular/common';
import { FormsModule } from '@angular/forms';
import { NgaModule } from '../../theme/nga.module';

import {routing} from "./manage.routing";
import {Manage} from "./manage.component";
import {Subjects} from "./subjects/subjects.component";
import {SubjectsService} from "./subjects/subjects.service";

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    NgaModule,
    routing
  ],
  declarations: [
    Manage,
    Subjects
  ],
  providers: [
    SubjectsService,
  ]
})
export class ManageModule {}