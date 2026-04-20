package com.examen.ultimatejereztiming.data.local

import com.examen.ultimatejereztiming.data.model.ContentType
import com.examen.ultimatejereztiming.data.model.GuideTopic

object GuideData {
    val topics = listOf(
        GuideTopic(
            id = "faq",
            title = "Preguntas Frecuentes",
            type = ContentType.FAQ,
            category = "General",
            content = """
                # CLUB FIDELIDAD ¿Qué es, quien pertenece y cómo puedo unirme?
                La Promoción Fidelidad es nuestra manera de agradecimiento a todos los aficionados que desean volver a vivir la emoción del mejor campeonato del mundo en el Circuito de Jerez-Ángel Nieto. Cada temporada, sus miembros disfrutan de acceso prioritario a la compra de entradas para el siguiente Gran Premio, además de un descuento exclusivo.
                
                Forman parte del Club Fidelidad todos nuestros clientes que adquirieron sus entradas para la edición anterior a través de nuestra web oficial (www.circuitodejerez.com) y que, antes de finalizar su compra, autorizaron la casilla “Deseo recibir información sobre promociones y/u otros productos (Club Fidelidad)”.
                
                Esta inscripción debe ser renovada cada año, ¡así que no olvides marcar esta casilla para poder acceder en primicia a nuestro portal de venta, elegir las mejores localidades disponibles y beneficiarte de un pequeño ahorro en tus entradas!
                
                # PROMOCIÓN NAVIDAD
                Si no estás dentro de la Promoción Fidelidad, ¡no te preocupes! Tienes la oportunidad de comprar tus entradas a precio reducido en la Promoción de Navidad antes de que suban los precios a su coste de venta definitivo. Aprovecha este periodo para regalar esta magnífica experiencia a tus seres más queridos.
                
                # ¿LOS NIÑOS PAGAN ENTRADAS?
                Los niños de hasta 3 años incluidos (a fecha del evento) NO pagan entrada, aunque no tienen derecho a asiento y deberán ir siempre acompañados de un adulto que los siente en brazos durante su estancia en la tribuna.
                
                Los niños de 4 a 13 años incluidos (a fecha del evento) podrán disfrutar de grandes descuentos.
                
                A partir de 14 años, se consideran adultos.
                
                El personal ubicado en los controles de accesos estará en disposición de solicitar documentación acreditativa de los menores.
                
                # PROMOCIÓN JÓVENES Y MAYORES
                Los jóvenes de 14 a 25 años y los mayores de 65 años, disfrutarán de un descuento en la zona de Pelousse
                
                El personal ubicado en los controles de accesos estará en disposición de solicitar documentación acreditativa a quienes porten estas entradas promocionales.
                
                # MOVILIDAD REDUCIDA
                Nuestras tribunas no son accesibles para usuarios de silla de ruedas o con movilidad reducida que requieran de ayudas técnicas similares. Para garantizar que todos los aficionados puedan disfrutar en condiciones de seguridad, accesibilidad y comodidad, disponemos de varias zonas reservadas para el público que no pueda hacer uso de las gradas, donde podrán acceder junto a un acompañante autorizado. Del mismo modo, contarán con facilidades de estacionamiento (en la medida de lo posible y según disponibilidad) para hacer más sencillos sus desplazamientos hasta las ubicaciones elegidas.
                
                Las entradas PMR en estos espacios reservados no están habilitadas para compra directa a través de la web. Si necesitas adquirir entradas adaptadas, hay que gestionarlo previamente presentando la documentación acreditativa requerida.
                
                Puedes solicitar más información a través del correo electrónico taquilla@circuitodejerez.com
                
                # ¿LAS ENTRADAS SON VÁLIDAS PARA LOS TRES DÍAS O PUEDO COMPRAR DÍAS SUELTOS?
                Desde hace años, todos nuestros tickets son válidos para los tres días del Evento (viernes, sábado y domingo), no se venden días sueltos.
                
                # PARKING COCHE INTERIOR
                El aparcamiento de coches en el interior del Circuito no está disponible para el público general debido a que las plazas de estacionamiento situadas dentro de las instalaciones están exclusivamente reservadas para miembros de la organización, equipos participantes, proveedores oficiales, autoridades, cuerpos de seguridad, personal médico y de emergencias…
                
                Los aficionados deberán utilizar las zonas de aparcamientos exteriores habilitadas específicamente para la celebración del Gran Premio.
                
                # PARKING MOTO INTERIOR
                Existen varias opciones de parking moto interior:
                
                Parking Motos Tribuna A10, para uso exclusivo de asistentes a la Tribuna A10 (Acceso por la Puerta 1)
                Parking Motos General, recomendado para los espectadores que asistan al evento y estén en esa área del Circuito: Curvas 1, 2, 3, 4 y 5; Tribunas C1, C2, C3, C4 y C5 (Acceso por la Puerta 3 Motos)
                Parking Motos Tribuna R9, gratuito e incluido en la entrada para asistentes a la Tribuna R9 (Acceso por la Puerta 3 Motos)
                
                # PARKING MOTO EXTERIOR
                Si no puedes acceder a ninguna de las opciones de Parking Moto Interior arriba dictadas, podrás aparcar de manera gratuita en nuestro parking Moto Exterior, situado justo enfrente de las Puertas 1 y 2.
                
                # ¿PUEDO COMPRAR ENTRADAS PARA ACCEDER AL PADDOCK?
                El Circuito de Jerez no comercializa pases de paddock.
                
                # ¿QUÉ HAGO SI NO HE RECIBIDO MI ENTRADA?
                Por favor, revisa tu bandeja de spam. Si sigues sin encontrarla, escríbenos a taquilla@circuitodejerez.com facilitándonos el correo electrónico que pusiste al hacer la compra y cualquier otra información que pueda ayudarnos a localizar tu entrada.
                
                SOLO PODREMOS AYUDARTE SIEMPRE Y CUANDO LA COMPRA HAYA SIDO A TRAVÉS DE NUESTRA WEB OFICIAL www.circuitodejerez.com
                
                Si has comprado en alguna web de reventa no podemos ayudarte.
                
                # ¿TENGO QUE IMPRIMIR MI ENTRADA O LA PUEDO LLEVAR EN EL MÓVIL?
                Para acceder al recinto, tendrás que presentar tu entrada en los accesos, bien impresa o bien en formato digital.
                
                Si la llevas en el móvil, asegúrate de tener batería durante todo el día. Por favor, descargad las entradas con anterioridad ya que puede haber problemas de conexión durante el fin de semana.
                
                # ¿PUEDO SALIR Y VOLVER A ENTRAR DEL CIRCUITO?
                Por supuesto que sí, tantas veces como quieras, pero es muy importante que te asegures de picar la salida en tu entrada en los controles, si no cuando vuelvas, tu entrada marcará que estás dentro y no te dejarán acceder nuevamente.
                
                # ¿LAS ENTRADAS SON NOMINATIVAS?
                Las entradas no son nominativas, esto quiere decir que con la entrada pueden acceder diferentes personas a lo largo del fin de semana, lógicamente NO en el mismo día. 
                
                # ZONA ACAMPADA Y AUTOCARAVANAS
                La zona oficial de acampada no la gestiona Circuito de Jerez, es una empresa externa quien la explota. Próximamente incluiremos link directo a la web del gestor.
                
                No está permitida la acampada en zonas de aparcamiento.
                
                # AUTOBUSES DESDE JEREZ
                Como cada año, el Ayuntamiento de Jerez pondrá a disposición de los asistentes al Gran Premio un servicio de lanzaderas con amplios horarios y paradas.
                
                # ¿PUEDO LLEVAR MI PROPIA COMIDA Y BEBIDA?
                Claro que sí, puedes acceder con tu comida e incluso bebida si lo deseas. Pero ten en cuenta que, por motivos de seguridad, en los accesos retirarán posibles objetos peligrosos como por ejemplo cristal o cuchillos.
                
                # ¿PUEDO LLEVAR BEBIDAS ALCOHÓLICAS?
                NO, la Ley del Deporte no lo permite.
                
                # ¿HABRÁ ZONA DE RESTAURACIÓN?
                Sí. Habrá zonas de restauración por todo el Circuito (food trucks, barras, etc.) disponibles en nuestras inmediaciones.
                
                # ¿HAY CAJERO AUTOMÁTICO?
                No, lo sentimos, pero no disponemos de ese servicio. Si vas a necesitar dinero en metálico no olvides traerlo.
                
                # ¿QUÉ ESTÁ PROHIBIDO?
                Por motivos de seguridad, queda prohibido: Envases de metal/vidrio, armas, bengalas, petardos, alcohol, drogas, animales (excepto asistencia), drones, etc.
                
                # EN CASO DE EVACUACIÓN
                - Mantenga la calma.
                - Obedezca las instrucciones del Personal de Seguridad.
                - No grite, no corra, abandone el lugar con orden.
                - No regrese a buscar objetos personales.
                - Diríjase a las zonas seguras más próximas.
            """.trimIndent()
        ),
        GuideTopic(
            id = "parking",
            title = "Información de Parkings",
            type = ContentType.NATIVE_TEXT,
            category = "Acceso",
            content = """
                # Parking A (Motos)
                Gratuito para todas las motocicletas.
                [BUTTON|Como ir|https://www.google.es/maps/dir//Aparcamiento+A+%7C+Circuito+de+Jerez,+11400+Jerez+de+la+Frontera,+C%C3%A1diz/@36.7115298,-6.0401596,554m/data=!3m1!1e3!4m18!1m8!3m7!1s0xd0db8cd1e60e47b:0x4ff736b17d327aad!2sAparcamiento+A+%7C+Circuito+de+Jerez!8m2!3d36.7124261!4d-6.0380448!15sChtwYXJraW5nIGNpcmN1aXRvIGplcmV6IDIwMjZaHSIbcGFya2luZyBjaXJjdWl0byBqZXJleiAyMDI2kgELcGFya2luZ19sb3SaASRDaGREU1VoTk1HOW5TMFZKUTBGblRVTlphR1ZNYXkxQlJSQULgAQD6AQQIABAy!16s%2Fg%2F11cp1p398d!4m8!1m0!1m5!1m1!1s0xd0db8cd1e60e47b:0x4ff736b17d327aad!2m2!1d-6.0380448!2d36.7124261!3e0?entry=ttu&g_ep=EgoyMDI2MDQxNS4wIKXMDSoASAFQAw%3D%3D]
                
                # Parking B (Coches - Pago)
                Abono 3 días. Requiere recogida previa de pase en Centro de Acreditaciones (Rotonda "El Ciclista Vulnerable").
                [BUTTON|Como ir|https://www.google.es/maps/dir//Aparcamiento+B+%7C+Circuito+de+Jerez,+11400+Jerez+de+la+Frontera,+C%C3%A1diz/@36.7102897,-6.0428501,392m/data=!3m1!1e3!4m17!1m7!3m6!1s0xd0db90068c26999:0xf6b2759cebbcd8cb!2sAparcamiento+B+%7C+Circuito+de+Jerez!8m2!3d36.7110016!4d-6.0408772!16s%2Fg%2F11mdg26ppw!4m8!1m0!1m5!1m1!1s0xd0db90068c26999:0xf6b2759cebbcd8cb!2m2!1d-6.0408772!2d36.7110016!3e0?entry=ttu&g_ep=EgoyMDI2MDQxNS4wIKXMDSoASAFQAw%3D%3D]
                
                # Parking C y D (Coches)
                Gratuitos. El Parking C abre 24h.
                [BUTTON|Como ir|https://www.google.es/maps/dir//Aparcamiento+B+%7C+Circuito+de+Jerez,+11400+Jerez+de+la+Frontera,+C%C3%A1diz/@36.7102897,-6.0428501,392m/data=!3m1!1e3!4m17!1m7!3m6!1s0xd0db90068c26999:0xf6b2759cebbcd8cb!2sAparcamiento+B+%7C+Circuito+de+Jerez!8m2!3d36.7110016!4d-6.0408772!16s%2Fg%2F11mdg26ppw!4m8!1m0!1m5!1m1!1s0xd0db90068c26999:0xf6b2759cebbcd8cb!2m2!1d-6.0408772!2d36.7110016!3e0?entry=ttu&g_ep=EgoyMDI2MDQxNS4wIKXMDSoASAFQAw%3D%3D]
                
                # Autocaravanas y Camper
                Prohibido en parkings de turismos. 
                Opciones: Acampada oficial o Parking gratuito en Jerez (Parque González Hontoria) con lanzadera.
            """.trimIndent()
        ),
        GuideTopic(
            id = "busforfun",
            title = "Bus For Fun",
            type = ContentType.NATIVE_TEXT,
            category = "Transporte",
            content = """
                # Servicio BusForFun
                Transporte organizado con acceso directo al circuito.
                
                # Rutas y Salidas
                Salidas desde: Jerez, El Puerto de Santa María, Cádiz y Sevilla.
                
                # Reservas
                Toda la información disponible en la web oficial de BusForFun.
                Consultas: info.es@busforfun.com
            """.trimIndent()
        ),
        GuideTopic(
            id = "autobuses",
            title = "Líneas de Autobuses",
            type = ContentType.NATIVE_TEXT,
            category = "Transporte",
            content = """
                # Lanzaderas Urbanas
                Servicio directo desde Rotonda del Minotauro (Estación Tren) y Parque González Hontoria.
                
                # Lanzadera Parking C
                Servicio gratuito entre Parking C y Venta la Cueva.
                
                # Horarios Lanzadera
                - Viernes 24: 07:30 - 20:30 (Cada 7 min)
                - Sábado 25: 07:00 - 20:30 (Cada 5 min)
                - Domingo 26: 06:00 - 17:00 (Cada 5 min)
            """.trimIndent()
        ),
        GuideTopic(
            id = "movilidad",
            title = "Movilidad Reducida",
            type = ContentType.NATIVE_TEXT,
            category = "General",
            content = """
                # Compromiso de Accesibilidad
                Zonas específicas y habilitadas para usuarios de silla de ruedas.
                
                # Gestión de Entradas
                No disponibles en web. Contactar: taquilla@circuitodejerez.com
                Requiere documentación acreditativa previa al evento.
                
                # Estacionamiento
                Plazas reservadas disponibles según disponibilidad.
            """.trimIndent()
        ),
        GuideTopic(
            id = "prog_jueves",
            title = "Programación Jueves 23",
            type = ContentType.SCHEDULE,
            category = "Programación",
            content = """
                12:45 - 14:00|[Pista] Track Technical Test
                14:00 - 19:00|[Pista] Two Wheels for Life - Paddock Visit
                14:30|[Pista] Track Safety Inspection
                14:30 - 16:00|[Pista] Riders Track Familiarisation
                16:00|[Pista] Press Conference
                16:30 - 17:30|[Pista] Public Pit Lane Walk
            """.trimIndent()
        ),
        GuideTopic(
            id = "prog_viernes",
            title = "Programación Viernes 24",
            type = ContentType.SCHEDULE,
            category = "Programación",
            content = """
                08:30|Bienvenida
                09:00 - 09:35|[Pista] Moto3™ Free Practice 1
                09:50 - 10:30|[Pista] Moto2™ Free Practice 1
                10:45 - 11:30|[Pista] MotoGP™ Free Practice 1
                11:30 - 13:15|Speaker - DJ - Animación
                12:00 - 12:25|[Pista] Red Bull MotoGP™ Rookies Cup Free Practice 1
                13:15 - 13:50|[Pista] Moto3™ Practice
                14:05 - 14:45|[Pista] Moto2™ Practice
                15:00 - 16:00|[Pista] MotoGP™ Practice
                16:00|Mascota + Regalos
                16:25 - 16:50|[Pista] Red Bull MotoGP™ Rookies Cup Free Practice 2
                16:55 - 17:55|[Pista] Media Laps
                17:00 - 18:30|Firma Pilotos
                18:00 - 18:20|[Pista] Red Bull MotoGP™ Rookies Cup Qualifying
                18:30 - 18:45|Acción DAZN
                18:30 - 19:00|[Pista] MotoGP™ Premier Track Tour
                18:45|Concierto Décum
                20:00|Despedida Fanzone
            """.trimIndent()
        ),
        GuideTopic(
            id = "prog_sabado",
            title = "Programación Sábado 25",
            type = ContentType.SCHEDULE,
            category = "Programación",
            content = """
                08:30|Bienvenida
                08:40 - 09:10|[Pista] Moto3™ Free Practice 2
                09:25 - 09:55|[Pista] Moto2™ Free Practice 2
                10:10 - 10:40|[Pista] MotoGP™ Free Practice 2
                10:50 - 11:05|[Pista] MotoGP™ Qualifying 1
                11:15 - 11:30|[Pista] MotoGP™ Qualifying 2
                11:35 - 12:00|[Pista] MotoGP™ VIP Village™ Pit Lane Walk
                11:35 - 12:00|[Pista] MotoEX2
                11:45 - 12:15|[Pista] MotoGP™ & Moto3™ Hero Walk
                12:15 - 12:30|[Pista] Red Bull FMX Show (Turn 9-10)
                12:45 - 13:00|[Pista] Moto3™ Qualifying 1
                13:10 - 13:25|[Pista] Moto3™ Qualifying 2
                13:40 - 13:55|[Pista] Moto2™ Qualifying 1
                13:00 - 13:25|[Pista] MotoEX2
                14:05 - 14:20|[Pista] Moto2™ Qualifying 2
                15:00|[Pista] MotoGP™ Tissot Sprint (12 Laps)
                16:00|DJ Set + Sorteos
                16:10|[Pista] Red Bull MotoGP™ Rookies Cup Race 1 (14 Laps)
                16:35 - 16:50|[Pista] MotoEX2
                17:00|Firma Pilotos
                17:00 - 17:15|[Pista] MotoEX2
                18:00 - 18:15|Acción DAZN
                17:45 - 18:30|[Pista] BMW M Laps
                18:30|Actuación Tony Grox y Lucycalys
                19:00|Actuación La Banda del Capitán Inhumano
                22:00|Despedida Fanzone
            """.trimIndent()
        ),
        GuideTopic(
            id = "prog_domingo",
            title = "Programación Domingo 26",
            type = ContentType.SCHEDULE,
            category = "Programación",
            content = """
                08:30|Bienvenida
                08:45|[Pista] Red Bull MotoGP™ Rookies Cup Race 2 (14 Laps)
                09:40 - 09:50|[Pista] MotoGP™ Warm Up
                09:50|DJ Set - Speaker - Animación
                10:00|[Pista] MotoGP™ Rider Parade
                10:00 - 10:30|[Pista] MotoGP™ VIP Village™ Pit Lane Walk
                10:20 - 10:40|[Pista] MotoGP™ Hero Walk
                11:00|[Pista] Moto3™ Race (19 Laps)
                12:15|[Pista] Moto2™ Race (21 Laps)
                13:00 - 13:25|[Pista] MotoEX2
                13:51|[Pista] Opening Ceremony
                13:52|[Pista] Patrulla Aspa Flyover
                14:00|[Pista] MotoGP™ Grand Prix (25 Laps)
                15:00 - 15:30|[Pista] Fan Track Walk
                15:30|Fiesta Despedida
            """.trimIndent()
        ),
        GuideTopic(
            id = "evacuacion",
            title = "Plan de Evacuación",
            type = ContentType.NATIVE_TEXT,
            category = "Seguridad",
            content = """
                # En caso de evacuación
                - MANTENGA LA CALMA.
                - OBEDEZCA INSTRUCCIONES DE SEGURIDAD.
                - NO GRITE, NO CORRA, SALGA CON ORDEN.
                - NO REGRESE A BUSCAR OBJETOS PERSONALES.
                - DIRÍJASE A LAS ZONAS SEGURAS PRÓXIMAS.
            """.trimIndent()
        ),
        GuideTopic(
            id = "obligaciones",
            title = "Normativa y Acceso",
            type = ContentType.NATIVE_TEXT,
            category = "Seguridad",
            content = """
                # Prohibiciones
                Armas, explosivos, mensajes violentos, drogas, alcohol, drones, animales.
                
                # Permanencia
                Prohibido agredir, alterar orden, cánticos racistas, lanzar objetos o saltar a pista.
                
                # Seguridad
                Recinto video-vigilado. Posibles registros en accesos. Expulsión inmediata ante incumplimiento.
            """.trimIndent()
        ),
        GuideTopic(
            id = "plano_completo",
            title = "Mapa del Circuito",
            assetPath = "PLANO-2026-A0-COMPLETO-01 (1).jpg",
            type = ContentType.IMAGE,
            category = "Mapa"
        ),
        GuideTopic(
            id = "camping_info",
            title = "Información de camping",
            type = ContentType.FAQ,
            category = "Campamento",
            content = """
                # Normativa de Camping
                1. Cuida tu pulsera. Es la única identificación que te permite acceder al recinto de acampada. Cualquier manipulación en ella hará que automaticamente queden anulados tus derechos de acceso. No se admiten devoluciones.

                Keep your identification. It´s your unique identification that allow you to join within the camping area. Any manipulation in the identification will do automatic your rights of access remind anulled. Returns are not admited.

                2. No se permite la entrada a personas no alojadas en la acampada. La entrada a la zona de acampada queda exclusivamente reservada a los usuarios. Existen zonas restringidas a clientes con reserva.

                There is not allowed entry to people not lodget at the camping area. The entrance of camping area users still have the entry to the exclusive area reserved. There exist area restricted are to clients with booking.

                3. Sigue las indicaciones de los vigilantes y acomodadores cuando accedas al recinto de acampada.

                It follows the indications of the watchmen and ushers when you should acced to the enclosure of camping area.

                4. Ante cualquier duda o incidencia en la zona de acampada, ponte en contacto con la oficina de recepción o a través de los vigilantes y acomodadores. Utiliza la consigna para los objetos de valor. Para su tranquilidad y seguridad de sus pertenencias deposite en recepción efectivo o otros objetos de valor. La organización no es responsable de los robos, sustracciones o daños que puedan sufrir los campistas en sus enseres.

                Use the locker for the objects of value. For your calm and safety of your belongins deposit in the reception the cash or objects of value. The organotation is not responsible for thefts, subtractions or hurts in the chattels that the camping area could offer.

                5. Prohibido hacer cualquier clase de fuegos. Está totalmente prohibido encender sobre el terreno cualquier tipo de fuego, a excepción de cocina pequeña de gas butano o barbacoas con carbón. Adoptando siempre las máximas medidas de seguridad.

                It is not allowed to do any kind of fires. This is one totally prohibited to ignite on the area any kind of fire, with the exception of small camping gas or barbecues with coal adopting always absolutly measures of safety.

                6. Prohibido utilizar material pirotécnico, petardos o bengalas.

                It is not allowed to use pyrotechnic material, petards or flares into the camping.

                7. Mantén limpia la acampada y respeta las señales internas. Sobre todo el control de velocidad máxima a 10km/h.

                Support cleans the camping area and respect the internal signs. Specially the speed control of 10km/h.

                8. Horas de descanso y silencio, desde las 24h a las 9h. Quedará prohibida la circulación de vehiculos que perturben el descanso de los campistas y toda clase de ruidos que molesten el descanso de los demás usuarios.

                Keep silence during hours of rest from 00h to 09h. There will reman prohibited the traffic of vehicles that disturbe the rest of the campers and all kinds of noises that area nuisance.

                9. Se prohíbe toda clase de venta no autorizada en la zona de acampada.

                It is not allowed all kinds of sales not authorized in the camping area.

                10. la acampada cuenta con puntos diversos de agua potable, asi como 2 ubicaciones para residuos y aguas grises de los vehiculos camperizados, queda totalmente prohibido evacuar en otro lugar que no sea el autorizado.

                The campsite has various drinking water points, as well as 2 spaces for waste and gray water from campervanized vehicles, it is totally prohibited to evacuate in any place other than the authorized one.

                11. En caso de ir acompañado de su mascota, se ruega que en todo momento vaya con su correa y este dentro de su parcela y que para sus necesidades lo saquen fuera de la acampada, (siempre portando bolsita sanitaria) además que en todo momento su mascota no podrá molestar al resto de usuarios, de no cumplir las normas deberá abandonar la zona de acampada.

                If you are accompanied by your pet, please keep it on a leash at all times and stay within your plot and take it out of the camp for its needs (always carrying a sanitary bag) in addition to keeping your pet at all times You will not be able to disturb the rest of the users, if you do not comply with the rules you must leave the camping area.

                12. El cliente que incumpla alguna de las normas será invitado a abandonar la zona de acampada. Si no lo hiciese voluntariamente será expulsado por el director, quien está oficialmente facultado para ello, requiriendo de ser preciso el apoyo de las fuerzas del orden público.

                The client who breaks someone of the rules, will be invited to leave to the camping area. If it was not doing it voluntarily, it will be expelled by the director, how this officialy authorized for it, needing if it was precise, the aid of the police.

                # Teléfonos de Interés
                - CIRCUITO DE JEREZ:
                [BUTTON|956 151 100|tel:956151100]
                
                - CIUDAD DE JEREZ SERVICIO DE INFORMACIÓN:
                [BUTTON|010|tel:010]
                
                - GRUPO HERMANOS TORO:
                [BUTTON|958 515 100|tel:958515100]
                
                - EMERGENCIAS:
                [BUTTON|112|tel:112]
                
                - HOSPITAL:
                [BUTTON|956 310 750|tel:956310750]
                
                - GUARDIA CIVIL:
                [BUTTON|956 330 362|tel:956330362]
                
                - POLICÍA LOCAL:
                [BUTTON|092|tel:092]
                
                - AEROPUERTO DE JEREZ:
                [BUTTON|956 150 000|tel:956150000]
                
                - TAXIS JEREZ:
                [BUTTON|956 342 319|tel:956342319]
                
                - RENFE JEREZ:
                [BUTTON|956 342 319|tel:956342319]
                
                - ESTACIÓN DE AUTOBUSES:
                [BUTTON|956 345 207|tel:956345207]
            """.trimIndent()
        ),
        GuideTopic(
            id = "camping_acceso",
            title = "Acceso al camping",
            type = ContentType.NATIVE_TEXT,
            category = "Campamento",
            content = """
                JUEVES 23: Toma la salida hacia el Circuito de Velocidad de Jerez, en la glorieta toma la Vía de Servicio A-382a hacia la zona de acampada.
                A
                VIERNES 24 Y SABADO 25 Y DOMINGO 26: puedes acceder por la Nacional CA-4103 a la zona de acampada.
                
                [BUTTON|Como llegar|https://www.google.es/maps/dir/CA-3107,+11400+Jerez+de+la+Frontera,+C%C3%A1diz/Parking+%26+Camping+%E2%80%A2+Circuito+%C3%81ngel+Nieto,+CA-4103,+11400+Jerez+de+la+Frontera,+C%C3%A1diz/@36.6976296,-6.0687233,15z/data=!4m16!4m15!1m5!1m1!1s0xd0dc74651139dc3:0x5bc9d117d54be05d!2m2!1d-6.0859911!2d36.6998093!1m5!1m1!1s0xd0db8c8fe1b49d5:0x9a0f650ea3dc51bd!2m2!1d-6.0447956!2d36.70949!2m1!1b1!3e0?hl=es&entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D]
            """.trimIndent()
        ),
        GuideTopic(
            id = "camping_plano",
            title = "Plano del camping",
            type = ContentType.IMAGE,
            assetPath = "plano-parcelas.jpg", // using an existing image to avoid crash if possible or keep empty
            category = "Campamento",
            content = ""
        )
    )
}
