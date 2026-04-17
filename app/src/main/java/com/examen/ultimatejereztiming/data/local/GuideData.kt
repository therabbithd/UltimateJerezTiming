package com.examen.ultimatejereztiming.data.local

import com.examen.ultimatejereztiming.data.model.ContentType
import com.examen.ultimatejereztiming.data.model.GuideTopic

object GuideData {
    val topics = listOf(
        GuideTopic(
            id = "faq",
            title = "Preguntas Frecuentes",
            type = ContentType.NATIVE_TEXT,
            category = "General",
            content = """
                # CLUB FIDELIDAD
                La Promoción Fidelidad es nuestra manera de agradecimiento...
                
                # PROMOCIÓN NAVIDAD
                Aprovecha este periodo para regalar esta magnífica experiencia...
                
                # ¿LOS NIÑOS PAGAN ENTRADAS?
                Niños hasta 3 años gratis (sin asiento). De 4 a 13 años con descuento.
                
                # MOVILIDAD REDUCIDA
                Tribunas no accesibles. Zonas reservadas disponibles bajo solicitud previa.
                
                # ¿ENTRADAS VÁLIDAS PARA 3 DÍAS?
                Sí, todos los tickets son válidos para viernes, sábado y domingo.
                
                # PARKING
                - Coche Interior: Reservado organización.
                - Motos: Varias opciones interiores (Acceso Puerta 1 y 3).
                - Exterior: Gratuito frente Puertas 1 y 2.
                
                # COMIDA Y BEBIDA
                Se permite comida y bebida (sin vidrio ni alcohol). No se permiten bebidas alcohólicas por Ley del Deporte.
                
                # PROHIBICIONES
                Drones, animales, armas, vidrio, alcohol, objetos de más de 500g.
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
                
                # Parking B (Coches - Pago)
                Abono 3 días. Requiere recogida previa de pase en Centro de Acreditaciones (Rotonda "El Ciclista Vulnerable").
                
                # Parking C y D (Coches)
                Gratuitos. El Parking C abre 24h.
                
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
            id = "prog_viernes",
            title = "Programación Viernes 24",
            type = ContentType.SCHEDULE,
            category = "Programación",
            content = """
                08:30|Bienvenida
                09:00 - 09:35|Free Practice 1 Moto3
                09:50 - 10:30|Free Practice 1 Moto2
                10:45 - 11:30|Free Practice 1 Moto GP
                11:30 - 13:15|Speaker - DJ - Animación
                13:15 - 13:50|Practice Moto3
                14:05 - 14:45|Practice Moto2
                15:00 - 16:00|Practice Moto GP
                16:00|Mascota + Regalos
                17:00 - 18:30|Firma Pilotos
                18:30 - 18:45|Acción DAZN
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
                08:40 - 09:10|Free Practice 2 Moto3
                09:25 - 09:55|Free Practice 2 Moto2
                10:10 - 10:35|Free Practice 2 Moto GP
                10:50 - 11:05|Qualifying 1 Moto GP
                11:15 - 11:30|Qualifying 2 Moto GP
                12:45 - 13:00|Qualifying 1 Moto3
                13:10 - 13:25|Qualifying 2 Moto3
                13:40 - 13:55|Qualifying 1 Moto2
                14:05 - 14:20|Qualifying 2 Moto2
                15:00|Sprint Moto GP
                16:00|DJ Set + Sorteos
                17:00|Firma Pilotos
                18:00 - 18:15|Acción DAZN
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
                09:40|Warm Up Moto GP
                09:50|DJ Set - Speaker - Animación
                11:00|Moto3 Race
                12:15|Moto2 Race
                14:00|Moto GP Race
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
        )
    )
}
