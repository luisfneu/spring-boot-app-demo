output "instance_ip" {
  description = "IP Público da instância EC2"
  value       = aws_instance.springboot_instance.public_ip
}
