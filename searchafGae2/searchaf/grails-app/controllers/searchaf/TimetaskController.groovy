package searchaf

import kxg.searchaf.url.SearchTaskFactory;

class TimetaskController {

	def index() {
	}

	def createtask (){
		def searchTask=SearchTaskFactory.getInstance();
		searchTask.run();
		render "searchTask start:"+searchTask.i
	}
	 
}
