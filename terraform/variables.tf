variable "region" {
  default = "us-east-1"
}

variable "ami_id" {
  description = "AMI ID da instância Ubuntu (e.g., Ubuntu Server 22.04)"
  default     = "ami-053b0d53c279acc90"
}

variable "key_pair_name" {
  description = "lneu_key"
  type        = string
}
