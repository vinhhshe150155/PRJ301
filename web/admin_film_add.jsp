<%@page import="model.Language"%>
<%@page import="model.Actor"%>
<%@page import="model.Category"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
  <title>AdminLTE 3 | General Form Elements</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="assets/plugins/fontawesome-free/css/all.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="assets/dist/css/adminlte.min.css">
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">
<jsp:include page="admin-header.jsp"/>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>General Form</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">General Form</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="row">
          <!-- left column -->
          <div class="col-md-6">
            <!-- general form elements -->
            <div class="card card-primary">
              <div class="card-header">
                <h3 class="card-title">Quick Example</h3>
              </div>
              <!-- /.card-header -->
              
              <form action="AddFilm" method="POST">
                <div class="card-body">
                  <div class="form-group">
                    <label for="exampleInputPassword1">Name</label>
                    <input name="name" type="text" class="form-control" id="exampleInputPassword1" placeholder="Name">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputEmail1">Image Link</label>
                    <input  name="image" type="text" class="form-control" id="exampleInputEmail1" placeholder="Image" value="assets/images/film/demo.jpg" readonly>
                  </div>
                  <div class="form-group">
                    <label for="exampleInputEmail1">Date release</label>
                    <input  name="date_release" type="text" class="form-control" id="exampleInputEmail1" placeholder="yyyy/mm/dd">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputEmail1">Start</label>
                    <input  name="start" type="text" class="form-control" id="exampleInputEmail1" placeholder="yyyy/mm/dd">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputEmail1">End</label>
                    <input  name="end" type="text" class="form-control" id="exampleInputEmail1" placeholder="yyyy/mm/dd">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputEmail1">Duration</label>
                    <input  name="duration" type="text" class="form-control" id="exampleInputEmail1" placeholder="duration">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputEmail1">Description</label>
                    <input  name="des" type="text" class="form-control" id="exampleInputEmail1" placeholder="Description">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputEmail1">Trailer</label>
                    <input  name="trailer" type="text" class="form-control" id="exampleInputEmail1" placeholder="Trailer">
                  </div>                   
                <div class="form-group">
                    <label>Category</label><br/>
                    <%List<Category> clist = new dal.CategoryDAO().getAllCategory();
                    for(Category c:clist){%>
                    <input type="checkbox" value="<%=c.getId()%>"><span style="text-transform: capitalize; margin: 4px"><%=c.getName()%></span>
                    <%}
                    %>
                </div>    
                 <div class="form-group">
                    <label>Actor</label><br/>
                    <%List<Actor> alist = new dal.ActorDAO().getAllActor();
                    for(Actor a:alist){%>
                    <input type="checkbox" value="<%=a.getId()%>"><span style="text-transform: capitalize; margin: 4px"><%=a.getName()%></span>
                    <%}
                    %>
                </div>
                <div class="form-group">
                    <label>Language</label><br/>
                    <%List<Language> llist = new dal.LanguageDAO().getAllLanguage();
                    for(Language l:llist){%>
                    <input type="checkbox" value="<%=l.getId()%>"><span style="text-transform: capitalize; margin: 4px"><%=l.getName()%></span>
                    <%}
                    %>
                </div>
                
                </div>
                <!-- /.card-body -->

                <div class="card-footer">
                  <button type="submit" class="btn btn-primary">Add</button>
                </div>
              </form>
            </div>


          </div>

          </div>
          <!--/.col (right) -->
        </div>
        <!-- /.row -->
      </div><!-- /.container-fluid -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <jsp:include page="admin-footer.jsp"/>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="assets/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- bs-custom-file-input -->
<script src="assets/plugins/bs-custom-file-input/bs-custom-file-input.min.js"></script>
<!-- AdminLTE App -->
<script src="assets/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="assets/dist/js/demo.js"></script>
<!-- Page specific script -->
<script>
$(function () {
  bsCustomFileInput.init();
});
</script>
</body>
</html>
