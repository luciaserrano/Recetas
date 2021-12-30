package com.example.tablayout_cocina.PrimerEjercicio;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import com.example.tablayout_cocina.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class TabsViewPager extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabs_pager);

        ArrayList<Receta> receta_array = new ArrayList<>();
        receta_array.add(new Receta(

                "lasana_fondo",
                "Lasaña de carne",
                "lasanadecarne",
                "Lasana de carne","ingredientes",
                "2 cebollas y 2 dientes de ajo 2 pimientos rojos 2 zanahorias Sal y pimienta negra recién molida (al gusto) 150 g. de bacon o panceta 500 g. de carne (una mezcla de cerdo y ternera) 12 láminas de lasaña o lasagna Garofalo 100 g. de queso rallado tipo Parmesano 100 ml. de aceite de oliva virgen extra 1 vaso de tomate natural 1 vaso de vino blanco Bechamel (la suficiente para cubrir la lasaña)",
                "Cómo preparar una lasaña casera",
                "Calentamos una cazuela grande de agua, la más ancha de casa. Cuando empiece a hervir echamos 2 puñados generosos de sal. Introducimos las láminas de lasaña una a una sin que se toquen (para que no se peguen entre ellas). Ahora podemos encontrar infinidad de tipos de lasaña donde no hace hidratarla como se hacía antes. En casa muchas veces para ahorrar tiempo empleo las que se hidratan con la bechamel y el jugo que suelta la salsa al hornear. Si lo hacéis de la manera tradicional tenemos que remover con una cuchara de madera y en unos 10 minutos sacamos las láminas. Las estiramos encima de unas hojas de papel absorbente de cocina. Aunque os parezca que no están, acabarán haciéndose en el horno. El siguiente paso será lavar muy bien todas las verduras que vamos a emplear en el relleno. En la receta os aconsejo el relleno de la clásica salsa boloñesa, zanahorias, ajo, pimientos y cebolla. Aunque se pueden añadir las que más os gusten en casa, un poquito de apio, unos espárragos trigueros o unas berenjenas le van perfectas. Imaginación y haréis una lasaña insuperable.",
                "lasanapaso1",
                "Cómo preparar el relleno de lasaña de carne",
                "Las verduras las cortamos en trocitos pequeños para que se junten bien en la salsa. Las zanahorias las cortamos lo más fino posible. Os recomiendo laminarlas con el pelador de las patatas porque a la hora de pocharlas si las tiras son gruesas no se hacen. Reservamos todo en un bol. En otra cazuela echamos aceite de oliva virgen extra. Empezamos introduciendo pochando la cebolla y el ajo, cuando esté doradita, añadimos el resto de ingredientes. Sofreímos todo a temperatura media durante unos 15 minutos y esperamos por la carne. Salpimentamos la carne al gusto y la echamos a la cazuela con la verdura. Dejamos que se pase durante 5 minutos y cuando veamos que va cambiando de color introducimos el bacon o panceta en trozos muy pequeños. Vertemos un vaso de vino blanco y esperamos a que reduzca (otros 5 minutos a fuego medio). Añadimos un vaso de tomate natural y rectificamos de sal y pimienta. Removemos la carne con las verduras y retiramos del fuego. Precalentamos el horno a 200º C durante 15 minutos, lo justo para hacer el resto de la lasaña.",
                "lasanapaso2",
                "Preparación de la salsa bechamel y final de la receta",
                "Mientras reposa la salsa vamos a preparar la bechamel, la podemos preparar más cremosa o más consistente dependiendo de las medidas. En el blog tenéis la receta de esta crema con todo lujo de detalles. Para montar la lasaña la cosa es muy sencilla. Ponemos en el fondo de la fuente unas cucharadas de la bechamel. Encima las láminas, una capa de la mezcla con la carne en cada lámina, otra vez la bechamel y así hasta tener 3 pisos. Se pueden hacer las capas de lasaña que quieras, bueno las que te permita la fuente. Finalmente rematamos con una capa generosa de bechamel Y para aquellos que le guste el queso, rallamos aquel que más os guste, que sea especial para gratinar. Os recomiendo un queso curadito tipo parmesano. Horneamos en la bandeja del medio durante 15 minutos a 180º C y durante 3-5 minutos en la parte superior con el gratinador puesto para que se dore. Ahí la tenéis, servidla calentita. Os aseguro que llega para 4 personas de manera generosa. Ya veréis como triunfáis en casa con esta receta, simplemente de rechupete. Si sois de los que con un café aguantáis toda la tarde sin bostezar, animaros con algo más potente como chorizo o morcilla.",
                0));
        receta_array.add(new Receta(
                "calamares_fondo",
                "Calamares en su tinta",
                "calamaresensutinta",
                "Calamares en su tinta",
                "ingredientes",
                "1 kg. calamares de calidad\n" +
                        "3 cebollas grandes\n" +
                        "2 dientes de ajo\n" +
                        "200 ml. vino blanco\n" +
                        "200 ml. de agua\n" +
                        "6 cucharadas de aceite de oliva virgen extra\n" +
                        "1 sobre de tinta de calamar\n" +
                        "Sal (al gusto)\n" +
                        "Opcional: 3-4 pimientas negras enteras (sin moler)\n" +
                        "Para acompañar: Arroz blanco redondo",
                "Cómo hacer calamares en su tinta con arroz blanco.",
                "Limpiamos los calamares retirándoles tripas, ojos, boca y concha interior. Los lavamos bien bajo el grifo para retirar posibles restos y escurrimos.\n" +
                        "Tenemos que tener precaución con reservar y no romper la bolsita de tinta que se encuentra en su interior. Esta tinta la utilizaremos para darle sabor y color a nuestro guiso. Cortamos el calamar en anillos y los tentáculos en trocitos y reservamos.\n" +
                        "Colocamos la tinta en un vaso con agua y aplastamos hasta romper la bolsa que la guarda para que se desprenda y tiña el agua. Reservamos.\n" +
                        "En un cazo incorporamos aceite de oliva virgen extra. Mientras este se calienta pelamos y cortamos la cebolla en trozos irregulares y los dientes de ajo muy picaditos.\n" +
                        "Incorporamos al cazo cuando el aceite esté caliente. Rehogamos a fuego medio durante 10 minutos, removiendo de vez en cuando para evitar que se queme al fondo. Añadimos los calamares cortados y dejamos que se sofrían con la cebolla durante 10 minutos más. Salpimentamos.",
                "calamarespaso1",
                "Guiso y cocción de los calamares en su tinta",
                "Vertemos el vino a la cazuela y seguimos cocinando durante 2 minutos hasta que se evapore el alcohol. Salamos y agregamos el agua teñida que tenemos reservada pasándola por un colador.\n" +
                        "Si queremos podemos agregar el contenido de un sobrecito de tinta de calamar comercializada. Es suficiente con que el agua cubra los calamares, no haría falta más. Dejamos que se cocine nuestro guiso a fuego medio durante 60 minutos, removiendo ocasionalmente para evitar que se pegue. Si por alguna razón la salsa es demasiado líquida y nos gusta más espesa sólo tendremos que añadir una cucharadita de almidón de maíz.\n" +
                        "La vamos a disolver en un par de cucharadas de agua. Así conseguiremos que espese la salsa ligeramente. Si por el contrario vemos que el agua se está quedando escasa durante el proceso, agregamos un poco más sin problema. Rectificando de sal si es preciso.",
                "calamarespaso2",
                "Preparamos el arroz blanco y presentación final",
                "En una cazuela pequeña ponemos dos cucharadas de aceite de oliva virgen extra. Dejamos que se caliente y añadimos los dos vasos de arroz. Lo sofreímos. A continuación agregamos el agua caliente. Dos vasos y medio de agua, por cada vaso de arroz. En nuestro caso serán 5 vasos completos de agua caliente. Ponemos sal, al gusto. Removemos.\n" +
                        "Lo llevamos a ebullición e inmediatamente después lo bajamos al mínimo. Tapamos la cacerola y vamos comprobando hasta que el agua se evapore. Lo apagamos y lo dejamos reposar 2 ó 3 minutos. Servimos los calamares acompañados de arroz blanco para poder empaparlo con la salsa.",
                1));

        receta_array.add(new Receta(
                "pasta_fondo",
                "Macarrones con atún y tomate",
                "macarronesconatunytomate",
                "Macarrones con atún y tomate",
                "ingredientes",
                "400 gr de macarrones\n" +
                        "1 cebolla grande\n" +
                        "800 g. de tomate triturado\n" +
                        "1 cucharadita de azúcar (opcional)\n" +
                        "200 g. de atún al natural en conserva\n" +
                        "Aceite de oliva virgen extra\n" +
                        "Sal\n" +
                        "Queso rallado tipo Gouda, Edam u otro que funda bien",
                "Preparación de la salsa de los macarrones. El atún con tomate",
                "Pelamos la cebolla y picamos finamente. Calentamos un poco de aceite de oliva en una cazuela y pochamos la cebolla picada a fuego suave durante aproximadamente 10 minutos o hasta que esté traslúcida. No dejéis que se dore porque puede amargar la salsa.\n" +
                        "A continuación añadimos el tomate triturado, todo de golpe. Si usamos tomate de lata, no tenemos más que abrir la lata y punto, pero si usamos tomate natural necesitaremos lavar bien cada pieza, triturar y pasar por un chino o colador para retirar los restos de pieles y pepitas.\n" +
                        "Agregamos también un poco de azúcar. Sí los tomates no son de temporada o son tomates de lata, tienden a ser demasiado ácidos. Por eso, con esto contrarrestamos sabores.\n" +
                        "Sazonamos y cocemos a medio-bajo suave durante 15 o 20 minutos o hasta obtener el punto de espesor que más os guste. A mí me gusta la salsa de tomate espesa, así que la reduzco bastante. Al gusto.\n" +
                        "Sí salpica mucho la salsa colocamos la tapa de la cacerola, pero sin cerrar y dejando una pequeña abertura. Esto permitirá que se vaya evaporando el líquido y que los salpicones no pongan todo perdido.",
                "macarronespaso1",
                "Cocción de la pasta y presentación final de los macarrones",
                "Mientras se hace la salsa de tomate ponemos a hervir abundante agua con sal en una cacerola. Usamos 1 litro y 10 gramos de sal por cada 100 gramos de pasta utilizados, según marcan los cánones italianos.\n" +
                        "Añadimos los macarrones y dejamos cocer un minuto menos del tiempo que nos recomienda el  fabricante. En este el fabricante recomienda 8 minutos, así que los cocemos solo 7 minutos. Escurrimos los macarrones y los refrescamos bajo el grifo de agua fría para cortar la cocción.\n" +
                        "Volvemos a la salsa para comprobar el punto de la misma y añadir el atún, bien escurrido, y cocer un par de minutos más. Probamos el punto de sal y rectificamos si fuera necesario.\n" +
                        "Cuando la salsa esté lista añadimos los macarrones a la misma, mezclamos bien para que la pasta se empape del sabor de la salsa y damos un hervor corto de un minuto. Servimos caliente en la mesa y acompañamos cada plato con un poco de atún y queso rallado al gusto.",
                "macarronespaso2",
                "Consejos para unos macarrones perfectos",
                "En temporada de tomate recomiendo usar producto fresco. Mucho más sabroso y dulce que el tomate en conserva que, por otro lado, es perfectamente digno. Yo lo utilizo muchísimo.\n" +
                        "Si os gustan las salsas sin tropezones, triturar la salsa de tomate antes de añadir el atún. No os estrañeis del cambio de color, se volverá anaranjada por la incorporación de aire y también por la cebolla, pero estará igual de buena.\n" +
                        "La salsa de tomate puede resultar ácida. Esto se soluciona añadiendo un poco de azúcar durante la cocción. Sí os gustan los sabores picantes, probar a añadir también pimienta negra.\n" +
                        "Esta es una salsa que congela estupendamente y que merece hacer en gran cantidad. Sí la guardáis en recipientes de ración solo tendréis que sacar del congelador y hervir los macarrones cuando os apetezca un plato de pasta.",
                0));
        receta_array.add(new Receta(
                "carne_fondo",
                "Gratinado de patatas, tocino y repollo del día de San Patricio",
                "polishcabbagepotatoandbacon",
                "Gratinado de patatas, tocino y repollo del día de San Patricio",
                "ingredientes",
                "600 g de patatas para cocer\n" +
                        "500 g. de repollo blanco\n" +
                        "220 g de tocino ahumado cocido\n" +
                        "300 ml de nata líquida\n" +
                        "1 cucharada de mantequilla sin sal\n" +
                        "1 diente de ajo\n" +
                        "25 g. de pan rallado\n" +
                        "1 cebolla grande\n" +
                        "150 g. de queso suave rallado para gratinar (le va bien el Edam o el Gouda)\n" +
                        "Sal y pimienta negra recién molida (al gusto de cada casa)\n" +
                        "Perejil fresco",
                "Preparación de las patatas",
                "Pelamos las patatas y lavamos en agua fría. Ponemos las patatas en una cazuela grande, cubrimos con agua fría y sazonamos con una pizca generosa de sal. Cubrimos la cacerola con una tapa, llevamos a ebullición a fuego alto y luego bajamos el fuego y cocinamos a fuego lento durante 10-12 minutos, no tienen que quedar totalmente cocidas, las queremos con un punto durillo, para que acaben de hacerse en el horno.\n" +
                        "Escurrimos bien las patatas, las cortamos en rodajas más o menos finas y reservamos.",
                " ",
                "Preparación del gratinado de patatas, repollo y tocino",
                "Pelamos el diente de ajo y lo picamos finamente. Pelamos la cebolla y las picamos en juliana pequeña. Cortamos el tocino ahumado cocido en daditos más o menos de un centímetro. Reservamos.\n" +
                        "En una sartén grande ponemos una cucharada de mantequilla y el tocino en dados, a fuego bajo vamos sofriendo con el ajo picado. Añadimos la cebolla, salpimentamos al gusto, mezclamos y dejamos pochar durante 5 minutos a fuego medio.\n" +
                        "Picamos la col verde muy finamente, no necesita que sea súper súper fino, importante que el cuchillo esté bien afilado, lo más finamente que puedo. De esa forma se cocina más rápido. Añadimos a la sartén con la cebolla, ajo y tocino. Salteamos hasta que quede tierna.\n" +
                        "Añadimos el perejil y mezclamos hasta que se integren con la mezcla. Salpimentamos. Añadimos la mitad del pan rallado y la nata, volvemos a mezclar. Ya tenemos la mezcla para hornear.",
                " ",
                "Montaje, gratinado y presentación final",
                "Precalentamos el horno a 200° C con calor arriba y abajo (y aire si lo tuviese).\n" +
                        "Elegimos una fuente de horno que tenga algo de altura (5-6 cm. por lo menos). Vamos a poner una capa de patatas en el fondo con un poco de queso y el relleno del repollo. Otra capa de patatas, relleno de repollo y tocino y terminamos con la última capa de patatas. Cubrimos con el queso y el resto de pan rallado. Y metemos al horno a 200º C en la posición central durante 20 minutos con papel de aluminio cubriendo la superficie.\n" +
                        "Ahora vamos a gratinar el pastel de patata, quitamos el papel de aluminio y gratinamos en la parte de arriba del horno durante 10 minutos o hasta que esté bien dorado por encima.\n" +
                        "Dejamos reposar 10 minutos y servimos bien caliente, os aseguro que está delicioso.",
                3));

        receta_array.add(new Receta(
                "pollo_fondo",
                "Pollo al ajillo",
                "polloalajillo",
                "Pollo al ajillo",
                "ingredientes",
                "1 pollo de corral troceado (2 kg.)\n" +
                        "8 dientes de ajo\n" +
                        "1 hoja de laurel\n" +
                        "300 ml. vino de Jerez o de un vino blanco de mi tierra, Ourense\n" +
                        "Hierbas aromáticas: 1 ramita de romero fresco y tomillo (al gusto)\n" +
                        "75 ml. de aceite de oliva virgen extra\n" +
                        "Sal y pimienta negra recién molida (al gusto de cada casa)\n" +
                        "Para decorar le irá bien un poco de perejil o cilantro fresco picado (opcional)",
                "Preparación del pollo guisado al ajillo",
                "Lo primero que hacemos al comprar el pollo es pedirle al carnicero que nos lo trocee. Ya en casa limpiamos bien los trozos de restos de grasa y les retiramos la piel salvo a las alitas. Eliminar la piel es opcional, pero considero que añade al plato un exceso de grasa innecesaria. Salpimentamos los trozos ligeramente.\n" +
                        "En una cazuela ancha ponemos a calentar abundante aceite de oliva y echamos los ajos sin pelar. Los cocinamos a fuego medio, estando pendientes de que no se nos quemen. La idea es que queden caramelizados y que sirvan de aromatizante de nuestro aceite. Cuando vemos que están blanditos tras unos 5 minutos, los retiramos y reservamos.\n" +
                        "Añadimos los trozos de pollo a la cazuela con el aceite aromatizado de los ajos, junto con la hojita de laurel, la rama de romero y el tomillo.\n" +
                        "El pollo debe de quedar bien frito, lo cual nos llevará unos 15 a 20 minutos por lo menos. Tenemos que estar pendientes de darle la vuelva a los trozos de vez en cuando para procurar que quede tostadito por todas partes. No se trata simplemente de dorarlo y sellarlo como cuando lo preparamos para un guiso. Lo que queremos es que el pollo quede perfectamente cocinado y tierno por dentro y tostadito por fuera.",
                "polloalajillopaso1",
                "Preparación final del pollo al ajillo",
                "Cuando vemos que nuestra carne está casi lista retiramos el exceso de aceite. Añadimos de nuevo los ajos que tenemos reservados y agregamos el vino. Seguimos cocinando la carne hasta que el vino se haya reducido casi por completo.\n" +
                        "Si no tenemos vino de Jerez podemos emplear perfectamente cualquier otro vino blanco de calidad que tengamos por casa. Un Albariño, un Godello… el Jerez le da un toque particular, pero con cualquiera de estos quedará estupendamente. Servimos calentito en la mesa con un poco de perejil picado por encima o cilantro. Sólo nos queda disfrutar de este auténtico “platazo”.\n" +
                        "Echad un poco de la salsa que quedará en la cazuela por encima. No os olvidéis de un buen pedazo de pan para degustar esta salsa de pollo, vino y ajo. Delicioso.",
                "polloalajillopaso2",
                "Consejos para un pollo al ajillo de rechupete",
                "Si te queda un poco seco, siempre puedes añadir a tu pollo al ajillo en salsa un poquito de caldo de pollo además del vino blanco que lleva la receta. Aunque en este caso os aseguro que si sigues la receta paso a paso te quedará perfecto.\n" +
                        "Tal como veis, el pollo va sin piel excepto las alitas. Si os da igual, dejaría un poco más de fritura para que la piel del pollo quede lo más crujiente posible, la grasa que soltará en la salsa también dará mayor sabor.\n" +
                        "Hay quien pasa el pollo por harina antes de freírlo para sellar el pollo, pero en mi caso creo que no hace falta, sólo conseguiremos que absorba aún más aceite.\n" +
                        "El toque del vinagre, ese punto ácido le va genial pero es opcional. Se añadiría al final de todo, al acabar de guisar el pollo, un chorretín sólamente. No me seáis valientes.\n" +
                        "La guarnición para acompañar este plato puede ser una simple ensalada mixta. Casi por el tema de equilibrar el plato. Pero el pollo al ajillo pide a gritos unas patatas fritas, patatas panadera o patatas a lo pobre, ¿no creéis? Otras guarniciones sencillas serían unos champiñones guisado con guisantes, arroz blanco o un puré de patatas. Las patatas al microondas que hemos preparado ya varias veces en el blog le van también como anillo al dedo. Una idea de acompañamiento casi sin grasa, una buena opción.",
                3));

        receta_array.add(new Receta(
                "arroz_fondo",
                "Pollo guisado al vino blanco con arroz blanco",
                "polloconarroz",
                "Pollo guisado al vino blanco con arroz blanco",
                "ingredientes",
                "1 pollo troceado para guisar (1.7-2 kg. aprox.)\n" +
                        "1 cebolla grande\n" +
                        "3 dientes de ajo\n" +
                        "Una ramita de tomillo, orégano y 2 hojitas de laurel\n" +
                        "250 ml. vino blanco\n" +
                        "Sal (al gusto) para el pollo y el arroz\n" +
                        "Caldo de ave o pollo para el guiso\n" +
                        "300 g. arroz de grano redondo SOS\n" +
                        "900 ml. de agua o caldo de pollo (para el arroz)\n" +
                        "Aceite de oliva virgen extra",
                "Preparación del pollo guisado. Olla express y en cazuela normal",
                "Limpiamos el pollo de restos de grasa y le retiramos la piel. En una olla expres o una cazuela normal (depende del proceso de cocción que vayamos a utilizar) calentamos un chorrito de aceite de oliva virgen extra. Cuando el aceite esté caliente añadimos el pollo troceado y lo doramos por todos sus lados.\n" +
                        "Cuando el pollo esté casi dorado, añadimos la cebolla pelada y cortada en 4 partes, los dientes de ajo pelados y enteros y el tomillo. Dejamos que se cocine 2 o 3 minutos y añadimos la sal y el vino blanco.\n" +
                        "Cocinamos durante 5 minutos hasta que el alcohol del vino se haya evaporado. Tapamos la olla expres y cocinamos durante 20 minutos. Pasado este tiempo tendremos la carne de pollo tierna y con una abundante cantidad de salsa.\n" +
                        "Si no tienes olla express, se puede hacer de manera tradicional en la cazuela de toda la vida. Doramos el pollo y pochamos las verduras tal como explico al principio.\n" +
                        "Añadimos el vino blanco y la misma cantidad de líquido (agua o caldo de ave), pues al cocer el pollo poco a poco, se evapora más líquido. Ponemos a cocer a fuego medio durante 40-45 minutos hasta que el pollo esté tierno.\n" +
                        "Si vemos que se queda sin líquido, añadimos un poco más a media cocción. Reservamos la carne y ponemos prácticamente toda la salsa en un cuenco.",
                "polloconarrozpaso1",
                "Preparación del arroz blanco y presentación final del plato",
                "En una cazuela calentamos un chorrito de aceite de oliva y un diente de ajo entero y pelado. Cuando el ajo esté dorado lo retiramos y añadimos el arroz. Rehogamos el arroz durante 2 o 3 minutos removiendo para que no se nos pegue a la cazuela.\n" +
                        "Incorporamos el caldo del estofado de pollo y complementamos con agua si es necesario hasta conseguir 3 partes de líquido por una parte de arroz.\n" +
                        "Cocinamos el arroz hasta que esté en su punto comprobando el punto de sal en la mitad de la cocción. Vamos probando el arroz. Cada arroz es un mundo, si en vez del arroz de grano largo empleáis arroz redondo el resultado será mejor. Aunque un poco más de coste en la receta. Esta variedad se diferencia del resto por ser un grano que no se rompe en la cocción sino que se abomba.\n" +
                        "Servimos el arroz junto con el pollo estofado. Se trata de uno de esos platos sencillos y reconfortantes, toda una receta de rechupete.",
                "polloconarrozpaso2",
                " ",
                " ",
                2));

        //configuracion toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Recetas");

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        TabsViewPagerAdapter adapter = new TabsViewPagerAdapter(getSupportFragmentManager(),getLifecycle(),receta_array);
        ViewPager2 viewPager =findViewById(R.id.viewP);
        viewPager.setAdapter(adapter);

        //definicion tablayout
        TabLayout tabLayout = findViewById(R.id.tablayout);
        //TabLayoutMediator permite sincronizar un tablayout con un viewpager
        TabLayoutMediator mediator = new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                //método para configurar los tabs
                if(position==0){
                    tab.setText("Pasta");
                } else if(position==1){
                    tab.setText("Pescado");
                } else if(position==2){
                    tab.setText("Arroz");
                } else if(position==3){
                    tab.setText("Carne");
                }
            }
        });
        //sincroniza el Mediator
        mediator.attach();
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //codigo para la pulsacion del botón atrás
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
