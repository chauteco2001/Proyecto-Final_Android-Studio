package com.example.proyecto_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.view.View;

public class PdfsActivity extends AppCompatActivity {
    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    List<String> urls;
    Adaptador adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfs);

        dataList = findViewById(R.id.dataList);
        titles = new ArrayList<>();
        images = new ArrayList<>();
        urls = new ArrayList<>();
 //NOMBRE DE LOS LIBROS
        titles.add("Eloquent_JavaScript ");
        titles.add("HTML Y CSS3");
        titles.add("manual-de-html-css");
        titles.add("Python Para todos");
        titles.add("Manual de Php");
        titles.add("Pro Git");
        titles.add("Introduccion a TypeScript");
        titles.add("Aprendizaje Jquery");
        titles.add("Algoritmos y Programacion");
        titles.add("Problemario de Algoritmos de Flujo y Pseudocodigo");
        titles.add("Fundamentos de Programación");
        titles.add("Problemas y Algoritmos");
        titles.add("Estructura de Datos en JavaScript");
        titles.add("Html y css Front");
        titles.add("El gran libro  de HTML5, CSS3 y Javascript ");
        titles.add("Diseño Web con Html y css");
        titles.add("Hackin the art of exploitation");
        titles.add("The Web Application Hacker’s Handbook");
        titles.add("Base de Datos");
        titles.add("Analis y Diseño de Base de Datos");
        titles.add("Fundamentos a SQL");
        titles.add("Gestores de Base de Datos");
        titles.add("Mtedologia Scrum Master");
        titles.add("Manual Basico de Andriod Studio");
        titles.add("Manual Programacion Andriod Studio");
        titles.add("Desarrollo de apps para Android ");
        titles.add("Manual Netbeans");
        titles.add("Curso de Java");
        titles.add("Php y Networking");
        titles.add("Tutorial Modelo Vista Controlador");

 //Direccion de las imagenes de cada una de las portadas
        images.add(R.drawable.libro1);
        images.add(R.drawable.libro11);
        images.add(R.drawable.libro3);
        images.add(R.drawable.libro4);
        images.add(R.drawable.libro5);
        images.add(R.drawable.libro6);
        images.add(R.drawable.libro7);
        images.add(R.drawable.libro8);
        images.add(R.drawable.libro9);
        images.add(R.drawable.libro10);
        images.add(R.drawable.libro11);
        images.add(R.drawable.libro12);
        images.add(R.drawable.libro13);
        images.add(R.drawable.libro14);
        images.add(R.drawable.libro15);
        images.add(R.drawable.libro16);
        images.add(R.drawable.libro17);
        images.add(R.drawable.libro18);
        images.add(R.drawable.libro19);
        images.add(R.drawable.libro20);
        images.add(R.drawable.libro21);
        images.add(R.drawable.libro22);
        images.add(R.drawable.libro23);
        images.add(R.drawable.libro24);
        images.add(R.drawable.libro25);
        images.add(R.drawable.libro26);
        images.add(R.drawable.libro27);
        images.add(R.drawable.libro28);
        images.add(R.drawable.libro29);
        images.add(R.drawable.libro30);

// Direccion de las urls de  los libros
        urls.add("https://eloquentjs-es.thedojo.mx/Eloquent_JavaScript.pdf");
        urls.add("https://gutl.jovenclub.cu/wp-content/uploads/2013/10/El+gran+libro+de+HTML5+CSS3+y+Javascrip.pdf");
        urls.add("https://aapp.files.wordpress.com/2010/07/manual-de-html-css.pdf");
        urls.add("https://persoal.citius.usc.es/eva.cernadas/informaticaparacientificos/material/libros/Python%20para%20todos.pdf");
        urls.add("https://waltercarnero.com/cfp/tpprgweb/Manual_Basico_PHP.pdf");
        urls.add("https://progit2.s3.amazonaws.com/es/2015-03-10-11982/progit-es.388.pdf");
        urls.add("https://blog.educalix.com/wp-content/uploads/2023/03/Manual-TypeScript.pdf");
        urls.add("https://riptutorial.com/Download/jquery-es.pdf");
        urls.add("https://digitk.areandina.edu.co/bitstream/handle/areandina/1281/Algoritmos%20y%20programacio%CC%81n.pdf?sequence=1");
        urls.add("https://editorial.uaa.mx/docs/algoritmos.pdf");
        urls.add("https://elhacker.info/manuales/Lenguajes%20de%20Programacion/Fundamentos_de_programaci%C3%B3n_4ta_Edici%C3%B3n_Luis_Joyanes_Aguilar_2.pdf");
        urls.add("https://editorial.unrn.edu.ar/media/data/lecturas/problemas_algoritmos_eunrn.pdf");
        urls.add("libro de estructura de datos y algoritmos pdf");
        urls.add("https://www.autentia.com/wp-content/uploads/libros/Front_HTMLyCSS-Autentia.pdf");
        urls.add("https://gutl.jovenclub.cu/wp-content/uploads/2013/10/El+gran+libro+de+HTML5+CSS3+y+Javascrip.pdf");
        urls.add("https://elhacker.info/manuales/Desarrollo%20web/Dise%C3%B1o%20Web%20con%20HTML%20&%20CSS,%20USERS%20-%20Gustavo%20Carballeiro.PDF");
        urls.add("https://edu.anarcho-copy.org/Against%20Security%20-%20Self%20Security/Dafydd%20Stuttard,%20Marcus%20Pinto%20-%20The%20web%20application%20hacker's%20handbook_%20finding%20and%20exploiting%20security%20flaws-Wiley%20(2011).pdf");
        urls.add("https://bdigital.uvhm.edu.mx/wp-content/uploads/2020/05/Bases-de-Datos.pdf");
        urls.add("https://munayi.uleam.edu.ec/wp-content/uploads/2022/07/Ana%CC%81lisis-y-disen%CC%83o-de-base-de-datos.pdf");
        urls.add("https://pedrobeltrancanessa-biblioteca.weebly.com/uploads/1/2/4/0/12405072/fundamentos_de_sql_3edi_oppel.pdf");
        urls.add("https://www.mheducation.es/bcv/guide/capitulo/8448148797.pdf");
        urls.add("https://www.scrummanager.com/files/scrum_master.pdf");
        urls.add("https://cursoslared.com/recursoslibre/TutorialAndroidPrincipiantes.pdf");
        urls.add("https://aluzardo.github.io/trabajo-fin-de-grado/Tutoriales/Manual%20Programacion%20Android.pdf");
        urls.add("https://www.uma.es/media/tinyimages/file/android_ed2.pdf");
        urls.add("https://www.unibarranquilla.edu.co/docs/33-L-de-Avila-Manual-de-NETBEANS.pdf");
        urls.add("https://www.cursodejava.com.mx/descargas/CursoJava.pdf");
        urls.add("http://www.upd.edu.mx/PDF/Libros/PhpNetwork.pdf");
        urls.add("https://www.codigonexo.com/wp-content/uploads/2014/06/Curso-completo-MVC.pdf");

        adapter = new Adaptador(this, titles, images, urls);

        int orientation = getResources().getConfiguration().orientation;

        int spanCount;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3;
        } else {
            spanCount = 2;
        }

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, spanCount, GridLayoutManager.VERTICAL, false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }

}
