package pk13;

public class HttpServletExample {

	public static void main(String[] args) {

		method(new LoginServlet());
		method(new FileDownloadServlet());
	}

	// method

	public static void method(HttpServlet http) {

		http.service();
	}
}
