package com.example.programacionfuncional.clase1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		Auto a1 = new Auto(1, "Rio", "Kia", 14.000);
		Auto a2 = new Auto(2, "Versa", "Nissan", 12.000);
		Auto a3 = new Auto(3, "Corolla", "Toyota", 21.000);
		Auto a4 = new Auto(4, "Onix", "Chevrolet", 13.000);
		Auto a5 = new Auto(5, "Centra", "Nissan", 18.000);
		Auto a6 = new Auto(6, "Yaris", "Toyota", 15.000);
		
		List<Auto> autos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Auto b1 = new Auto(11, "Hillux", "Toyota", 24.000);
		Auto b2 = new Auto(12, "Ranger", "Ford", 24.000);
		
		List<Auto> autosb = Arrays.asList(b1, b2);
		
//		forEach
//		autos.stream().forEach(e -> e.setModelo(e.getModelo() + " 2021"));
//		autos.stream().forEach(e -> System.out.println(e.getModelo()));
		
//		map
//		List<String> lstModelos = autos.stream().map(e -> e.getModelo()).collect(Collectors.toList());
//		lstModelos.stream().forEach(e -> System.out.println(e));
		
//		filter
//		List<Auto> lstFiltrada = autos.stream()
//											.filter(e -> e.getPrecio() > 17.000)
//											.filter(e -> !e.getMarca().toUpperCase().equals("NISSAN"))
//											.collect(Collectors.toList());
//		lstFiltrada.stream().forEach(e -> System.out.println(e.getMarca()));
		
//		findFirst
//		Auto auto = autos.stream()
//				.filter(e -> e.getPrecio() > 17.000)
//				.findFirst().orElse(null);
//		
//		if(auto != null) {
//			System.out.println(auto.getMarca() + " " + auto.getModelo());
//		}else {
//			System.out.println("Auto agotado");
//		}
		
//		flatMap
//		List<List<Auto>> lstAutos = new ArrayList<List<Auto>>(Arrays.asList(
//				new ArrayList<Auto>(autos),
//				new ArrayList<Auto>(autosb)
//				));
//		
//		List<Auto> listaUnica = lstAutos.stream().flatMap(e -> e.stream()).collect(Collectors.toList());	
//		
//		listaUnica.stream().forEach(e -> System.out.println(e));
//		
		
//		peek
		
		
//		count
//		long cantidadModelos = autos.stream().count();
//		System.out.println(cantidadModelos);

//		skip y limit
//		List<Auto> listaAutos = autos.stream().skip(3).limit(2).collect(Collectors.toList());
//		listaAutos.forEach(e -> System.out.println(e.getModelo()));

//		distinctByKey (metodo implementado en la parte de abajo)
//		List<Auto> listaAutosB = autosb.stream()
//				.filter(distinctByKey(e -> e.getPrecio())).collect(Collectors.toList());
//		listaAutosB.stream().forEach(e -> System.out.println(e));
		
//		min y max
//		Auto autoMin = autos.stream().min(Comparator.comparing(Auto :: getPrecio)).orElse(null);
//		System.out.println(autoMin);
//		
//		Auto AutoMax = autos.stream().max(Comparator.comparing(Auto :: getPrecio)).orElse(null);
//		System.out.println(AutoMax);
		

//	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
//	    Set<Object> seen = ConcurrentHashMap.newKeySet();
//	    return t -> seen.add(keyExtractor.apply(t));
//	}
	
//		sorted
//		List<Auto> lstAutosAsc = autos.stream().sorted(Comparator.comparing(Auto :: getPrecio)).collect(Collectors.toList());
//		lstAutosAsc.stream().forEach(e -> System.out.println(e));

//		allMatch
//		Boolean estado = autos.stream().allMatch(e -> e.getPrecio() > 18.000);
//		System.out.println(estado);
		
//		anyMatch
//		Boolean estado = autos.stream().anyMatch(e -> e.getPrecio() > 18.000);
//		System.out.println(estado);

//		noneMatch
//		Boolean estado = autos.stream().noneMatch(e -> e.getPrecio() > 30.000);
//		System.out.println(estado);
		
//		joining
//		String respuesta = autos.stream().map(e -> e.getModelo()).collect(Collectors.joining(" | "));
//		System.out.println(respuesta);
		
//		toSet()	-> muestra lista desordenada y muestra uno de los elementos repetidos
		Set<String> respuesta = autos.stream().map(e -> e.getMarca()).collect(Collectors.toSet());
		System.out.println(respuesta);
		
	}
}
