
<%@page import="model.Film"%>
<%@page import="model.Account"%>
<%@page import="model.Account"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
  <title>AdminLTE 3 | Simple Tables</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="assets/plugins/fontawesome-free/css/all.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="assets/dist/css/adminlte.min.css">
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">
  <!-- Navbar -->
  <jsp:include page="admin-header.jsp"/>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Simple Tables</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Simple Tables</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        
        <!-- /.row -->

        <!-- /.row -->
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">List Film</h3>
                    <a href="AddFilm?type=2"><input type="submit" value="Add"></a>
                <div class="card-tools">
                      
                      <form action="admin-filmControl" method="get">
                          <div class="input-group input-group-sm" style="width: 150px;">
                              <input type="text" hidden name="type" value="0">
                              <input type="text" name="searchValue" class="form-control float-right" placeholder="Search">
                            <div class="input-group-append">
                            <button type="submit" class="btn btn-default">
                                <i class="fas fa-search"></i>
                            </button>
                            </div>
                          </div>
                      </form>
                    


                  
                </div>
              </div>
              <!-- /.card-header -->
              <div class="card-body table-responsive p-0" style="height: 600px;">
                <table class="table table-head-fixed text-nowrap">
                  <thead>
                    <tr>
                      <th>ID</th>
                      <th>Name</th>
                      <th>Image</th>
                      <th>Date release</th>
                      <th>Start</th>
                      <th>End</th>
                      <th>Trailer</th>
                      <th>Description</th>
                      <th>Action</th>
                    </tr>
                  </thead>

                  <tbody>
                    <%  List<Film> list;
                        String search = request.getParameter("searchValue");
                        search = search==null?"":search;
                        list = new dal.ListFilm().getFilmByName(search);
                       
                        for(Film f:list){%>
                    <tr>
                        <td><%=f.getFilmID()%></td>
                        <td><%=f.getName()%></td>
                        <td><img style="width:20px" src="<%=f.getFilm_image()%>"></td>
                        <td><%=f.getDate_release()%></td>
                        <td><%=f.getFilm_start_date()%></td>
                        <td><%=f.getFilm_end_date()%></td>
                        <td><%=f.getTrailer()%></td>
                         <td><%=f.getFilm_description()%></td>
                        <td>
                           
                                <a href="admin-filmControl?type=1&id=<%=f.getFilmID()%>"><input type="submit" value="Edit"></a>
                           
                            
                            <!--<input type="button" value="Edit">-->
                        </td>
                    </tr>
        
            
                    <%}%>
                  </tbody>
                </table>
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
          </div>
        </div>
        <!-- /.row -->
    
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
<!-- AdminLTE App -->
<script src="assets/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="assets//dist/js/demo.js"></script>
</body>
</html>
