package business;

import java.util.*;
import java.util.stream.Collectors;

import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;

public class Main {

	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingOverdueBook());
		System.out.println(allHavingMultipleAuthors());

	}
	//Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
	public static List<String> allWhoseZipContains3() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		List<String> allIds = mems.stream()
				.filter(x -> x.getAddress().getZip().contains("3"))
				.map(x -> x.getMemberId())
				.collect(Collectors.toList());
		return allIds;
		
	}
	//Returns a list of all ids of  LibraryMembers that have an overdue book
	public static List<String> allHavingOverdueBook() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		//
		return null;
		
	}
	
	//Returns a list of all isbns of  Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		List<String> isbn = bs.stream()
				.filter(x->x.getAuthors().size()>1)
				.map(x->x.getIsbn())
				.collect(Collectors.toList());
		return null;
		
		}

}
