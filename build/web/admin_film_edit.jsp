<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
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
  <!-- Navbar -->
  
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <jsp:include page="admin-header.jsp"/>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Film</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Film</li>
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
                <h3 class="card-title">Edit</h3>
              </div>
              <!-- /.card-header -->
              <c:set var="f" value="${requestScope.f}"></c:set>
              <form action="admin-filmControl" method="POST">
                <div class="card-body">
                   <div class="form-group">
                    <label for="id">ID</label>
                    <input value="${f.filmID}" readonly name="id" type="text" class="form-control" id="id" placeholder="ID">
                  </div>
                  <div class="form-group">
                    <label for="name">Name</label>
                    <input value="${f.name}" name="name" type="text" name="name" class="form-control" id="name" placeholder="Name">
                  </div>
                  <div class="form-group">
                    <label for="image">Image Link</label>
                    <input value="${f.film_image}" type="text" name="image" class="form-control" id="image" placeholder="Image">
                  </div>
                  <div class="form-group">
                    <label for="date_release">Date release</label>
                    <input value="${f.date_release}"  type="text" name="date_release" class="form-control" id="date_release" placeholder="Date release">
                  </div>
                  <div class="form-group">
                    <label for="film_start_date">Start</label>
                    <input  value="${f.film_start_date}"  type="text" name="film_start_date" class="form-control" id="film_start_date" placeholder="Start Date">
                  </div>
                  <div class="form-group">
                    <label for="film_end_date">End</label>
                    <input value="${f.film_end_date}"  type="text" name="film_end_date" class="form-control" id="film_end_date" placeholder="End date">
                  </div>
                  <div class="form-group">
                    <label for="duration">Duration</label>
                    <input value="${f.duration}"  type="number" class="form-control" name="duration" id="duration" placeholder="Duration">
                  </div>
                  <div class="form-group">
                    <label for="description">Description</label>
                    <input value="${f.film_description}"  type="text" class="form-control" name="description" id="description" placeholder="Description">
                  </div>
                  <div class="form-group">
                    <label for="trailer">Trailer Link</label>
                    <input value="${f.trailer}"  type="text" class="form-control" name="trailer" id="trailer" placeholder="Trailer">
                  </div>
                </div>
                <!-- /.card-body -->

                <div class="card-footer">
                  <button type="submit" class="btn btn-primary">Submit</button>
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
